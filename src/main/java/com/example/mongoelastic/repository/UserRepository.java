package com.example.mongoelastic.repository;

import com.example.mongoelastic.entity.UserDocument;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository("UserRepository")
public interface UserRepository extends ElasticsearchRepository<UserDocument,String> {
//    UserDocument findById(int userNo);

}
