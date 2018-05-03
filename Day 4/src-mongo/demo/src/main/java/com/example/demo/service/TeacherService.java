package com.example.demo.service;

import com.example.demo.Repository.TeacherRepository;
import com.example.demo.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TeacherService {
    @Autowired //Injection code
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(String id){
        return teacherRepository.findOne(id);
    }

    public void addTeacher(Teacher newTeacher){
        teacherRepository.save(newTeacher);
    }

    //@Deprecated
    public void deleteTeacher(String id){
      teacherRepository.delete(id);
    }

    @Deprecated
    public void deleteTeacher(int id){
        //teacherRepository.delete(id);
    }


}


