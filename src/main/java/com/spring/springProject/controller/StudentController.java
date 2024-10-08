package com.spring.springProject.controller;


import com.spring.springProject.entity.Student;
import com.spring.springProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/student") //new data creation
    public void create(@RequestBody Student student) throws Exception {
        service.saveData(student);
    }
}
