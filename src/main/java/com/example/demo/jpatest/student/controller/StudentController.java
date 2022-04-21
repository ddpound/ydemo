package com.example.demo.jpatest.student.controller;

import com.example.demo.jpatest.model.Student;
import com.example.demo.jpatest.model.StudentClass;
import com.example.demo.jpatest.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //insert
    @GetMapping(value = "")
    public String getStudent(){

        return "";
    }

    @PostMapping(value = "save-student")
    public String insertStudent(@RequestBody Student student){

        int resultNum = studentService.insertStudent(student);


        if(resultNum == 1){
            return "success";
        }else if(resultNum == -1){
            return "fail";
        }

        return "error";
    }

    @PostMapping(value = "save-student-class")
    public String insertStudentClass(@RequestBody StudentClass studentClass){
        int resultNum = studentService.insertStudentClass(studentClass);

        if(resultNum == 1){
            return "success";
        }else if(resultNum == -1){
            return "fail";
        }

        return "error";

    }

    @PutMapping(value = "update-student")
    public String updateStudent(@RequestBody Student student){
        int resultNum = studentService.updateStudent(student);

        if(resultNum == 1){
            return "success";
        }else if(resultNum == -1){
            return "fail";
        }

        return "error";
    }





}
