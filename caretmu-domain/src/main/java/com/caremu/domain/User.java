package com.caremu.domain;

import java.util.Date;

/**
 * Created by darchrow on 2016/1/23.
 */
public class User {

    private long uid;
    private String userName;
    private String password;

    private Date birthDay;

    public User() {
    }

    public User(long uid, String userName, String password, Date birthDay) {
        this.uid = uid;
        this.userName = userName;
        this.password = password;
        this.birthDay = birthDay;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
