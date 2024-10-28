package com.vedruna.api_rest_tabla_productos2.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class MainController {
    
    @RequestMapping("/")
    public String saludo() {
        return "Hello World";
    }
}