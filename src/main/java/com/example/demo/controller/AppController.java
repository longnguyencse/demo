package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author Mikorn vietnam
 * Created on 14-Feb-19.
 */
@RestController
public class AppController {
    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    public String hello(){
        return "Hello there";
    }
}
