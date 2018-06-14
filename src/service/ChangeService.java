package service;

import entity.ChangeConfig;
import entity.ChangeFormEntity;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author longwm
 */
public class ChangeService {

    private Map<String, ChangeConfig> configMap;

    public ChangeService(){
        configMap = new HashMap<>();

        PersonServiceImpl personService = new PersonServiceImpl();
        configMap.put(personService.getChangeConfig().getChangeBelong(), personService.getChangeConfig());
    }


    public void changeService(List<ChangeFormEntity> changeFormEntityList) throws IllegalAccessException, InstantiationException, IntrospectionException, InvocationTargetException, NoSuchFieldException, ParseException, NoSuchMethodException {

        Map<String, Object> objectMap = new HashMap<>();

        for (ChangeFormEntity changeFormEntity : changeFormEntityList) {
            Object object;

            String changeBelong = changeFormEntity.getChangeBelong();

            ChangeConfig changeConfig = this.configMap.get(changeFormEntity.getChangeBelong());
            if (changeConfig == null) {
                throw new RuntimeException("变更回调业务修改服务未注册");
            }
            Class clazz = changeConfig.getBeanClass();

            object = objectMap.get(changeBelong) == null ? clazz.getDeclaredConstructor().newInstance() : objectMap.get(changeBelong);

            createObj(changeFormEntity,changeConfig,object);

            objectMap.put(changeBelong, object);

        }

        for (Map.Entry<String, Object> entry : objectMap.entrySet()) {
            ChangeConfig changeConfig = this.configMap.get(entry.getKey());
            changeConfig.getChangeDataService().doChange(entry.getValue());
        }

    }

    public Object createObj(ChangeFormEntity changeFormEntity,ChangeConfig changeConfig, Object object) throws IllegalAccessException, InvocationTargetException, IntrospectionException, NoSuchFieldException, ParseException {

        Class clazz = object.getClass();
        //设置主键
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(changeConfig.getBeanPrimaryKeyFieldName(), clazz);

        Method method = propertyDescriptor.getWriteMethod();

        method.invoke(object, changeFormEntity.getChangeAttrId());

        propertyDescriptor = new PropertyDescriptor(changeFormEntity.getChangeAttrCode(), clazz);

        method = propertyDescriptor.getWriteMethod();

        Field field = clazz.getDeclaredField(changeFormEntity.getChangeAttrCode());

        method.invoke(object, this.formatInFieldType(field, changeFormEntity));

        return object;
    }


    private Object formatInFieldType(Field field, ChangeFormEntity changeFormEntity) throws ParseException {
        Object val;
        Class<?> clazz = field.getType();
        if ("java.util.Date".equals(clazz.getName())) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
            val = simpleDateFormat.parse(changeFormEntity.getChangeNewVal());
        } else {
            val = changeFormEntity.getChangeNewVal();
        }

        return clazz.cast(val);
    }

}
