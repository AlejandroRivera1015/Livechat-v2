package com.app.livechat.Controller.AuthController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.livechat.Entity.Users.UserDTO;
import com.app.livechat.Service.User.UserServicesImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserServicesImpl userServices;


    @PostMapping("/login")
    public String login(@RequestBody UserDTO user){

        System.out.println(userServices.logIn(user.getEmail(),user.getPassword())+"lol");
        return  userServices.logIn(user.getEmail(),user.getPassword());
    }
    
    

}
