package com.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

public class Person {


    ///primitive data type--non-primitive datatype
    private int age; //primitive data type

    @Autowired  //user defined dat type
    @Qualifier("address1")
    private Address address;


//    Address add=new Address();
//    Address add=new Address();

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
