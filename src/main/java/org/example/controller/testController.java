package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping("/message")
    public String getMessage() {
        return "This is a new application to be deployed in Azure";
    }
}
