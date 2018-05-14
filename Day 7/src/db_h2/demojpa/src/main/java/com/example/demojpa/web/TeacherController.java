package com.example.demojpa.web;

import com.example.demojpa.domain.Teacher;
import com.example.demojpa.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")

public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }


    @RequestMapping(method = RequestMethod.POST)
    public void addTeacher(@RequestBody TeacherRequestDTO newTeacher){
        teacherService.addTeacher(newTeacher);
    }

    public static class TeacherRequestDTO{
        private String name;
        private long ci;
        //private String prefession;

        public void setName(String name) {
            this.name = name;
        }

        public void setCi(long ci) {
            this.ci = ci;
        }

//        public void setPrefession(String prefession) {
//            this.prefession = prefession;
//        }

        public String getName() {
            return name;
        }

        public long getCi() {
            return ci;
        }

//        public String getPrefession() {
//            return prefession;
//        }
    }
}

