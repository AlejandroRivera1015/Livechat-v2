package com.app.server.livechat.DTO;

import lombok.Getter;

@Getter
public class LiveChatUserDTO {

    private Long id;
    private String email;
    private String password;
    private String token;


    public LiveChatUserDTO(){  }
 


    public LiveChatUserDTO(Long id,  String token){
        this.id = id;
        this.token = token;

    }

    public LiveChatUserDTO(String email, String password){
        this.email = email;
        this.password = password;

    }



}
