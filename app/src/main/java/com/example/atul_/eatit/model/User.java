package com.example.atul_.eatit.model;

/**
 * Created by atul_ on 11/01/2018.
 */

public class User {
    private String Name;
    private  String Password;
    private String Phone;
    private String SecureCode;
    private String IsStaff;



    public User(){

    }

    public User(String name, String password) {

        Name = name;
        Password = password;

    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setSecureCode(String secureCode) {
        SecureCode = secureCode;
    }

    public void setIsStaff(String isStaff) {
        IsStaff = isStaff;
    }
}


