package entity;

import java.util.Date;

/**
 *
 * @author longwm
 */
public class Person {
    private String id;
    private String name;
    private Date birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return (Date) birthday.clone();
    }

    public void setBirthday(Date birthday) {
        this.birthday = (Date) birthday.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
