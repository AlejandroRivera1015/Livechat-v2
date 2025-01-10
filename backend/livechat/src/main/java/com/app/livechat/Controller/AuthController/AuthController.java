package com.app.livechat.Controller.AuthController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.livechat.Entity.Users.UserDTO;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("login")
    public String login(@RequestBody UserDTO user){
        return "temp String, probbably a jwt?";
    }
    
    

}
