package com.github.schiluka.frontend.controller;

import com.github.schiluka.frontend.dto.Message;
import com.github.schiluka.frontend.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Very basic HTTP controller.
 *
 * @author schiluka
 */
@Controller
class IndexController {

    @Autowired
    private MessageService service;

    @GetMapping("/")
    String index(Model model) {
        Message message = service.call();
        model.addAttribute("message", message);
        return "index";
    }

}
