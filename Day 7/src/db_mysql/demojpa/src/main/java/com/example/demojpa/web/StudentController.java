package com.example.demojpa.web;


import com.example.demojpa.domain.Student;
import com.example.demojpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @RequestMapping(method = RequestMethod.POST)
    public void addStudent(@RequestBody StudentRequestDTO newTeacher){
        studentService.addStudentTeacher(newTeacher);
    }

    public static class StudentRequestDTO{
        private String name;
        private Long codeSis;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getCodeSis() {
            return codeSis;
        }

        public void setCodeSis(Long codeSis) {
            this.codeSis = codeSis;
        }
    }
}