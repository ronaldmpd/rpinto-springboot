package com.example.demojpa.service;


import com.example.demojpa.domain.Subscription;
import com.example.demojpa.domain.Teacher;
import com.example.demojpa.repository.SubscriptionRepository;
import com.example.demojpa.repository.TeacherRepository;
import com.example.demojpa.web.SubscriptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SubscriptionService {
    // Injection de dependenia
    @Autowired
    private SubscriptionRepository subscriptionRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Subscription> getAllTeachers(){
        //TODO use repository
        List<Subscription> list = new ArrayList<>();
        subscriptionRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    public void addSubscription(SubscriptionController.SubscriptionRequestDTO newSubscriptionDTO){
        //TODO add into Database
        Subscription newSubscription = new Subscription();
        newSubscription.setSubDate(new Date());
        Teacher teacher = teacherRepository.findById(newSubscriptionDTO.getTeacherId()).get();
        newSubscription.setTeacher(teacher);
        subscriptionRepository.save(newSubscription);
        System.out.println("the Name of teacher is --->" + newSubscription.getSubDate());
    }
}