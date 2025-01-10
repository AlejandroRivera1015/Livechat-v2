package com.app.livechat.Entity.Conversations;

import java.util.List;

import com.app.livechat.Entity.Message.Message;
import com.app.livechat.Entity.Users.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;



@Entity(name = "conversations")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;


    @ManyToMany(mappedBy = "conversations")
    private List<User> relatedUsers;


    @OneToMany(mappedBy = "conversation")
    private List<Message> messages;



}
