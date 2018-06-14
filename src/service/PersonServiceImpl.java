package service;

import entity.ChangeConfig;
import entity.ChangeDataService;
import entity.Person;

/**
 *
 * @author longwm
 */
public class PersonServiceImpl implements PersonService, ChangeDataService<Person> {
    @Override
    public Boolean doChange(Person entity) {
        System.out.println("PersonServiceImpl.doChange");
        return true;
    }

    @Override
    public ChangeConfig getChangeConfig() {
        ChangeConfig changeConfig = new ChangeConfig();
        changeConfig.setChangeBelong("Person");
        changeConfig.setBeanPrimaryKeyFieldName("id");
        changeConfig.setBeanClass(Person.class);
        changeConfig.setChangeDataService(this);
        return changeConfig;
    }

}
