package com.codewithkris.oauth2demo;

import java.security.Principal;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello Word";
    }

    @GetMapping("/not-restricted")
    public String notRestricted() {
        return "you don't need to be logged in";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "if you see this you are logged in";
    } 
    
    @GetMapping("/user")
    public Principal getUser(Principal user) {
String nom = user.getName();
        return user;
    }
    
}
