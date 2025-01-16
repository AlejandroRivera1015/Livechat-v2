package com.app.livechat.Service.User;

import org.springframework.stereotype.Service;

@Service
public interface UserServices {

    String logIn(String username, String password);

}
