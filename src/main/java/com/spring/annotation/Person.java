package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    private int age;


    @Autowired
    private Address address;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", address=" + address +
                '}';
    }
}
