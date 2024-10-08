package com.spring.springProject.entity;



import jakarta.persistence.*;
import jakarta.transaction.Transactional;


@Entity
@Transactional
@Table(name="student")
public class Student {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
    private Addresss address;

    public Addresss getAddress() {
        return address;
    }

    public void setAddress(Addresss address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
