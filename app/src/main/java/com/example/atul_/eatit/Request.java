package com.example.atul_.eatit;

import com.example.atul_.eatit.model.Order;

import java.util.List;

/**
 * Created by Admin on 24-Feb-18.
 */

class Request {

    private String phone;
    private String name;
    private String address;
    private String total;
    private List<Order> foods;
// list of food Order

    public Request(){

    }

    public Request(String phone, String name, String address,String total, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.total = total;
        this.foods = foods;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    } }


