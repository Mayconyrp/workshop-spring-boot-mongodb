package com.yri.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yri.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
 