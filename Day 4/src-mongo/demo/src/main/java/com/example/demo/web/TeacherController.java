package com.example.demo.web;


import com.example.demo.domain.Teacher;
import com.example.demo.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import static java.lang.Math.toIntExact;

@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TeacherController {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @Autowired
    private TeacherService teacherService;

    @ApiOperation(value = "Search a product with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeachers();
    }

    @ApiOperation(value = "Search a product with an ID",response = Teacher.class)
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Teacher getTeacherById(@PathVariable String id){

        logger.info("the value of teacher is" + id);
        //int idInt = toIntExact(id);
        return teacherService.getTeacherById(id);
    }

//    @RequestMapping(method = RequestMethod.PATCH)
//    public ResponseEntity update(@RequestBody Teacher teacher){
//        logger.info("test----->" + teacher.getId());
//        System.out.println("the values i");
//        return  new ResponseEntity(HttpStatus.OK);
//    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Teacher teacher){
        logger.info("test----->" + teacher.getId());
        teacherService.addTeacher(teacher);
        System.out.println("the values i");
        System.out.println("create: " + teacher);
        return  new ResponseEntity(HttpStatus.OK);
    }

//
//    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity deleteTeacher(@PathVariable int id){
//        //logger.info("test----->" + teacher.getId());
//        System.out.println("the values i");
//        teacherService.deleteTeacher(toIntExact(id));
//        return  new ResponseEntity(HttpStatus.NO_CONTENT);
//    }
//
//
//    @RequestMapping(method = RequestMethod.DELETE)
//    public ResponseEntity deleteTeacherByTeacher(@RequestBody Teacher teacher){
//        System.out.println("the values i");
//        teacherService.deleteTeacher(toIntExact(teacher.getId()));
//        return  new ResponseEntity(HttpStatus.NO_CONTENT);
//
//    }





}


