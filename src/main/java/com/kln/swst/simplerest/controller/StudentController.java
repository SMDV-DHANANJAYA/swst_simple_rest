package com.kln.swst.simplerest.controller;

import com.kln.swst.simplerest.model.Student;
import com.kln.swst.simplerest.repository.StudentRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Student get() throws IllegalArgumentException{
        Student student = new Student();
        student.setName("vishwa");
        student.setAge(78);
        return student;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }
}