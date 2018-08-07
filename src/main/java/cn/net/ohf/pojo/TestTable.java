package cn.net.ohf.pojo;

import java.util.Date;

public class TestTable {
    private Integer id;

    private String name;

    private String sex;

    private Date birthday;

    private String heartRate;

    private String kpa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate == null ? null : heartRate.trim();
    }

    public String getKpa() {
        return kpa;
    }

    public void setKpa(String kpa) {
        this.kpa = kpa == null ? null : kpa.trim();
    }
}