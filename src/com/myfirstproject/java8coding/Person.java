package com.myfirstproject.java8coding;

public class Person {
    int id;
    String name;
    String Address;

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setId(int id) {
        this.id = id;
    }
}
