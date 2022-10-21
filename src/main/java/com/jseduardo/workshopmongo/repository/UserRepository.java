package com.jseduardo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jseduardo.workshopmongo.demain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
