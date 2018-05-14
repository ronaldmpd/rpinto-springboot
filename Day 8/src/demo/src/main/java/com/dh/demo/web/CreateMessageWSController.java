package com.dh.demo.web;

import com.dh.demo.modelws.Greeting;
import com.dh.demo.modelws.HelloMessage;
import com.dh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * Created by jhonny on 6/17/17.
 */
@Controller
//controller for WS != HTTP
public class CreateMessageWSController {
    @Autowired
    UserService userService;
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;
    // full path /app/hello
    //for WS: (websockets)
    //localhost:8080/app/hello
    @MessageMapping("/hello")

    //for HTTP
    //@RequestMapping

    // broadcast
    //@SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        //slack channel /topic/greetings  -- BroadCast
        simpMessagingTemplate.convertAndSend("/topic/greetings", new Greeting("Hello, curso: " + message.getName() + "!"));


        return new Greeting("Hello -<>, " + message.getName() + "!");
        //userService.addUser();

    }


}
