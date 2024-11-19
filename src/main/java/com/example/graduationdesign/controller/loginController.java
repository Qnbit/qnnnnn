package com.example.graduationdesign.controller;

//import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "登录")
@RestController
@RequestMapping("/api")
public class loginController {
//    @ApiModelProperty(value = "用户名")

    @RequestMapping("/login")
    public String login(String username,String password) {
        if (username.equals("admin") && password.equals("admin")) {
            return "登录成功";
        } else {
            return "登录失败";
        }
    }
}
