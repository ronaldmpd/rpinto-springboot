package com.example.demojpa.repository;

import com.example.demojpa.domain.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    //@Query("select u from Teacher u where u.name like %?1")
    // List<Teacher> findByName(String name);

}

