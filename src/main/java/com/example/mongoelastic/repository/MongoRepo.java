package com.example.mongoelastic.repository;


import com.example.mongoelastic.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoRepo extends MongoRepository<User,String> {
    List<User> findById(int userNo);
}
