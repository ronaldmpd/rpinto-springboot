package com.dh.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by jhonny on 6/17/17.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //enable broadcat of message
        config.enableSimpleBroker("/topic");
        // call websocket call enpoints
        //websocket enpoint app endpoint
        //ws:localhost:8080/app   //app is prefijo
        config.setApplicationDestinationPrefixes("/app");

    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // registry enpoint CORS websocket

        //message endpoints
        //CORS FOR ws, != HTTP
        registry.addEndpoint("/chat-ws").setAllowedOrigins("*").withSockJS();
    }


}
