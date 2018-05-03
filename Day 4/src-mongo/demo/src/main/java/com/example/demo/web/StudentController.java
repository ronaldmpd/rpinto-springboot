package com.example.demo.web;


import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class StudentController {
    // dependency Injection
    @Autowired
    private StudentService studentService;
    // Get all teachers
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
        //return teacherService.getStudentById(id);
    }
    // insert new Student
    @RequestMapping(method = RequestMethod.POST)
    public void addNewStudent(@RequestBody Student newStudent){
        System.out.println("the Name of new Student is "+newStudent.getName());
        studentService.addNewStudent(newStudent);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateStudent(@RequestBody Student newStudent){
        System.out.println("the Name of update Student is "+newStudent.getName());
        studentService.updateNewStudent(newStudent);
    }

    // delete Student : localhost:9090/teacher/2
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable String id){
        System.out.println("the Id delete is " + id);
        studentService.deleteStudent(id);
        //teacherService.deleteStudent(id);
    }

    // delete Student by Id using Request Body
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteStudentByRequ(@RequestBody Student teacher){
        System.out.println("the id of teacher to delete is "+ teacher.getCi());
        studentService.deleteStudent(teacher.getId());
        //teacherService.deleteStudent((int)teacher.getCi());
    }

}
