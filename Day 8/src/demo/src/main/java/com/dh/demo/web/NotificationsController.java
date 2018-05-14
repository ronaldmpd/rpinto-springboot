package com.dh.demo.web;


import com.dh.demo.modelws.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationsController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @RequestMapping(method = RequestMethod.POST)
    public void addNewGroup(String msg){
        simpMessagingTemplate.convertAndSend("/topic/greetings", new Greeting("Notifcations All!" + msg));
    }
}
