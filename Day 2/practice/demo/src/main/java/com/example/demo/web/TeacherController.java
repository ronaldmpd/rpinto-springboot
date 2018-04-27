package com.example.demo.web;


import com.example.demo.domain.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getTeacher(){
        return teacherService.getAllTeachers();
    }
}

