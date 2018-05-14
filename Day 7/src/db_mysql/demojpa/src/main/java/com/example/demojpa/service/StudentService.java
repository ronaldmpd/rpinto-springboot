package com.example.demojpa.service;


import com.example.demojpa.domain.Student;
import com.example.demojpa.repository.StudentRepository;
import com.example.demojpa.web.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    // Injection de dependenia
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        //TODO use repository
        List<Student> list = new ArrayList<>();
        studentRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public void addStudentTeacher(StudentController.StudentRequestDTO newTeacheDTO){
        //TODO add into Database
        Student newTeacher = new Student();
        newTeacher.setCodeSis(newTeacheDTO.getCodeSis());
        newTeacher.setName(newTeacheDTO.getName());
        studentRepository.save(newTeacher);
        System.out.println("the Name of teacher is --->" + newTeacher.getName());
    }
}