package com.app.livechat.Repository.Message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.livechat.Entity.Message.Message;
import java.util.List;



@Repository
public interface MessagesRepository extends JpaRepository<Message,Double> {


    List<Message> findByCoversationId(Double coversationId);

}
