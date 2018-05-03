package com.example.demo.Repository;

import com.example.demo.domain.Student;
import com.example.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface StudentRepository extends MongoRepository<Student, String> {

    List<Teacher> getStudentById (String id);

}

