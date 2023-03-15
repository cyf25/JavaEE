package personal.xjl.jerrymouse.entity;

import java.util.Optional;

public class Student {
    private int Id;
    private String name;
    private String password;
    private Integer sex;
    private String clazz;
    private String birthday;


    public Student(int id, String name, String password, Integer sex, String clazz, String birthday) {
        this.Id = id;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.clazz = clazz;
        this.birthday = birthday;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + Id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", clazz='" + clazz + '\'' +
                ", birthday='" + birthday + '\'' +

                '}';
    }
}
