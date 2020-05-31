package com.github.schiluka.frontend.service;

import com.github.schiluka.frontend.dto.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {

    public Message call() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://demo-backend:8080/", Message.class);
    }
}
