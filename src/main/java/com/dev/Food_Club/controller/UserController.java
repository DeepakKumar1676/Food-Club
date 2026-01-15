package com.dev.Food_Club.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("get-response")
    public String getResponse()
    {
        return "hellow";
    }

}
