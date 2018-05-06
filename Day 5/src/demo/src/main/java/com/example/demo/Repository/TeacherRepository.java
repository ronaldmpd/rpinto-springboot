package com.example.demo.Repository;

import com.example.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface TeacherRepository extends MongoRepository<Teacher, String> {

   Teacher getTeacherById (String id);

}

