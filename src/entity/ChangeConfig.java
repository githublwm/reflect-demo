package entity;

/**
 *
 * @author longwm
 */
public class ChangeConfig {
    private String beanPrimaryKeyFieldName;
    private String changeBelong;
    private Class<?> beanClass;
    private ChangeDataService<?> changeDataService;

    public String getBeanPrimaryKeyFieldName() {
        return beanPrimaryKeyFieldName;
    }

    public void setBeanPrimaryKeyFieldName(String beanPrimaryKeyFieldName) {
        this.beanPrimaryKeyFieldName = beanPrimaryKeyFieldName;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public String getChangeBelong() {
        return changeBelong;
    }

    public void setChangeBelong(String changeBelong) {
        this.changeBelong = changeBelong;
    }

    public ChangeDataService getChangeDataService() {
        return changeDataService;
    }

    public void setChangeDataService(ChangeDataService<?> changeDataService) {
        this.changeDataService = changeDataService;
    }
}
