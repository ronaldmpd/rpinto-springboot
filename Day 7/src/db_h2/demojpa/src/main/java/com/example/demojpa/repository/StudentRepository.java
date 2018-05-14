package com.example.demojpa.repository;


import com.example.demojpa.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}