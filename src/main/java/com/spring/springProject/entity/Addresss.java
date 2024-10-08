package com.spring.springProject.entity;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Table(name="addresss")
public class Addresss {

    @Column(name="addressId")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;

    @Column(name="state")
    private String state;

    @Column(name="country")
    private String country;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Addresss{" +
                "addressId=" + addressId +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
