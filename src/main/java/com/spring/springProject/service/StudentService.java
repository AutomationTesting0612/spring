package com.spring.springProject.service;

import com.spring.springProject.entity.Student;
import com.spring.springProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    StudentRepository repository;


    public void saveData(Student student){
        repository.save(student);

    }
}
