import entity.ChangeFormEntity;
import service.ChangeService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        ChangeFormEntity changeFormEntity = new ChangeFormEntity();
        changeFormEntity.setChangeBelong("Person");
        changeFormEntity.setChangeAttrCode("name");
        changeFormEntity.setChangeNewVal("myname");

        ChangeFormEntity changeFormEntity1 = new ChangeFormEntity();
        changeFormEntity1.setChangeBelong("Person");
        changeFormEntity1.setChangeAttrCode("birthday");
        changeFormEntity1.setChangeNewVal("2018/01/23");

        List<ChangeFormEntity> list = new ArrayList<>();
        list.add(changeFormEntity);
        list.add(changeFormEntity1);

        ChangeService changeService = new ChangeService();
        changeService.changeService(list);

    }
}
