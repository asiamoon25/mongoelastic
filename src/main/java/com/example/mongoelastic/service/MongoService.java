package com.example.mongoelastic.service;

import com.example.mongoelastic.entity.User;
import com.example.mongoelastic.repository.MongoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MongoService {
    private final MongoRepo mongoRepo;


    public List<User> getUserList(int userNo1) {
        System.out.println("test");
        int userNo = 1;
        return mongoRepo.findById(userNo);
    }
}
