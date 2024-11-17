package com.example.graduationdesign.controller;

import com.example.graduationdesign.common.QN;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping
    public QN<String> test(){
        return QN.success("hello");
    }

    @RequestMapping("/test2")
    public String test2(){
        return "hello2";
    }
}
