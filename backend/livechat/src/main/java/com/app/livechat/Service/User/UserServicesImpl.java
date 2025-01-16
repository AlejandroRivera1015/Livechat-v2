package com.app.livechat.Service.User;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.livechat.Entity.Users.User;
import com.app.livechat.Repository.User.UserRepository;


@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;


    @Override
    public String logIn(String username, String password) {

        try{
            Optional<User> user = userRepository.findByEmailAndPassword(username, password);
            System.out.println(user.toString());


            //TODO: create token to return

            System.out.println(user.isPresent() ? "logged" : "error to log in");
            return user.isPresent() ? "logged" : "error to log in";


        }catch(Exception e){
            System.out.println("error getting user from repo / service");
            return "null";
        }

    }

}
