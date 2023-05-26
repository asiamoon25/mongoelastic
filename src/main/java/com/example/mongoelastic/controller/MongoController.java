package com.example.mongoelastic.controller;

import com.example.mongoelastic.entity.User;
import com.example.mongoelastic.entity.UserDocument;
import com.example.mongoelastic.service.ElasticsearchService;
import com.example.mongoelastic.service.MongoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RequiredArgsConstructor
@RestController
public class MongoController {

    private  final MongoService mongoService;
    private  final ElasticsearchService elasticsearchService;
    @GetMapping("/user/{userNoString}")
    public List<User> findById(@PathVariable String userNoString){
        System.out.println("test : "+userNoString);
        int userNo = Integer.parseInt(userNoString);
        List<User> elasticDocu = mongoService.getUserList(userNo);
        System.out.println(UserDocument.from(elasticDocu.get(0)));
        elasticsearchService.save(UserDocument.from(elasticDocu.get(0)));

        return elasticDocu;
    }
}
