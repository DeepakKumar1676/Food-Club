package com.dev.Food_Club.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("get-response1")
    public String getResponse1()
    {
        return "hellow";
    }



    @GetMapping("response2")
    public String getResponse2()
    {
        return "hellow";
    }

}
