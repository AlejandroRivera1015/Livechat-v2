package com.app.livechat.Entity.Message;

import org.hibernate.annotations.ManyToAny;

import com.app.livechat.Entity.Conversations.Conversation;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "messages")
@Setter
@Getter
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;


    private Double coversationId;

    private String sender;
    private String message;
    private Double status;
    private String date;



    
    @ManyToOne
    private Conversation conversation;

}