package com.app.livechat.Repository.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.livechat.Entity.Users.User;


@Repository
public interface UserRepository extends JpaRepository<User, Double> {


    User findByEmailAndPassword(String email, String password);

}
