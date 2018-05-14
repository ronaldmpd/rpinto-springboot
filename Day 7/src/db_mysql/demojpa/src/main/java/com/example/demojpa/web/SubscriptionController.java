package com.example.demojpa.web;


import com.example.demojpa.domain.Subscription;
import com.example.demojpa.service.SubscriptionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/subscription")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")

public class SubscriptionController {
    @Autowired
    SubscriptionService subscriptionService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Subscription> getAllSubscriptions(){
        return subscriptionService.getAllSubscriptions();
    }


    @RequestMapping(method = RequestMethod.POST)
    public void addSubscription(@RequestBody SubscriptionRequestDTO newTeacher){
        subscriptionService.addSubscription(newTeacher);
    }

    public static class SubscriptionRequestDTO{
        private Date subDate;
        private Long teacherId;
        private Long studentId;

        public Date getSubDate() {
            return subDate;
        }

        public void setSubDate(Date subDate) {
            this.subDate = subDate;
        }

        public Long getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(Long teacherId) {
            this.teacherId = teacherId;
        }

        public Long getStudentId() {
            return studentId;
        }

        public void setStudentId(Long studentId) {
            this.studentId = studentId;
        }
    }
}