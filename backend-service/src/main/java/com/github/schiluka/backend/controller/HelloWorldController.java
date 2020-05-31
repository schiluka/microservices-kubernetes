package com.github.schiluka.backend.controller;

import com.github.schiluka.backend.dto.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello controller.
 *
 * @author schiluka
 */
@RestController
class HelloWorldController {

    @GetMapping("/")
    public Message index(){
        return new Message("from backend docker service");
    }

}
