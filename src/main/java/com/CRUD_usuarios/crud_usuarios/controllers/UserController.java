package com.CRUD_usuarios.crud_usuarios.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @GetMapping("/createUser")
    public String createUser() {
        return "OI";
    }
}
