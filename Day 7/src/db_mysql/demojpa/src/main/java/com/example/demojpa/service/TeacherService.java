package com.example.demojpa.service;


import com.example.demojpa.domain.Teacher;
import com.example.demojpa.repository.TeacherRepository;
import com.example.demojpa.web.TeacherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    // Injection de dependenia
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        //TODO use repository
        List<Teacher> list = new ArrayList<>();
        teacherRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public void addTeacher(TeacherController.TeacherRequestDTO newTeacheDTO){
        //TODO add into Database
        Teacher newTeacher = new Teacher();
        newTeacher.setCi(newTeacheDTO.getCi());
        newTeacher.setName(newTeacheDTO.getName());
        teacherRepository.save(newTeacher);
        System.out.println("the Name of teacher is --->" + newTeacher.getName());
    }
}
