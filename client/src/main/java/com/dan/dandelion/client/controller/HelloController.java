package com.dan.dandelion.client.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }


}