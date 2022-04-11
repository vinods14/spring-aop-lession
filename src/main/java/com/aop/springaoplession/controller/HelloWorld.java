package com.aop.springaoplession.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public ResponseEntity<?> helloWorld(){
        return new ResponseEntity<>("Hello from Spring!", HttpStatus.OK);
    }
}
