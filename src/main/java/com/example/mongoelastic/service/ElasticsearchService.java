package com.example.mongoelastic.service;

import com.example.mongoelastic.entity.UserDocument;
import com.example.mongoelastic.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@NoArgsConstructor
@Service
public class ElasticsearchService {
    @Autowired
    UserRepository userRepository;


    public void save(UserDocument userDocument){
        userRepository.save(userDocument);
    }

}
