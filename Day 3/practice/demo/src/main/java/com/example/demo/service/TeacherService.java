package com.example.demo.service;

import com.example.demo.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    private static final List<Teacher> listTeachers = new ArrayList<>();

    public  TeacherService(){
        //List<Teacher> listTeachers = new ArrayList<>();
        listTeachers.add(new Teacher(0, "jhonny"));
        listTeachers.add(new Teacher(1, "Gabriel"));
        listTeachers.add(new Teacher(2, "Su"));
    }

    //list teacher
    public List<Teacher> getAllTeachers(){
        return listTeachers;
    }

    // add teacher
    public void addNewTeacher(Teacher newTeacher){
        listTeachers.add(newTeacher);
    }

    //delete teacher
    public void deleteTeacher(int id){
        try {
            listTeachers.remove(id);
        }catch (Exception ex){

        }
    }

    //get teacher by id
    public Teacher getTeacherById(int id){
        return listTeachers.get(id);
    }

}

