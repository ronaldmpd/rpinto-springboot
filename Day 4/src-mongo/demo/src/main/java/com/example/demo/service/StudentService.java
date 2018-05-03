package com.example.demo.service;


import com.example.demo.Repository.StudentRepository;
import com.example.demo.domain.Student;
import com.example.demo.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static final List<Student> listTeacher = new ArrayList<>();

    @Autowired
    private StudentRepository studentRepository;

    public StudentService(){

    }

    // CRUD
    // List Teachers
    public List<Student> getAllStudents(){
        //get all documents from collection teacher
        return studentRepository.findAll();

        // get all teacher from DB
        //return listStudent;
    }
    // Add new Student
    public void addNewStudent(Student newStudent){
        // insert new Student into DB
        studentRepository.save(newStudent);
        //listStudent.add( newStudent);
    }

    public void updateNewStudent(Student newStudent){
        // insert new Student into DB
        studentRepository.save(newStudent);
        //listStudent.add( newStudent);
    }



    public void deleteStudent(String id){
        // delete a teacher by id in DB
        studentRepository.delete(id);
        //listStudent.remove(id);
    }



    public Student getStudentById(String id){
        // get a Student by id from DB
        return studentRepository.findOne(id);
        //return listStudent.get(id);
    }


}

