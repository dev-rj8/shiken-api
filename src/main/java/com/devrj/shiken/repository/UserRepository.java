package com.devrj.shiken.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devrj.shiken.model.User;

public interface UserRepository extends MongoRepository<User, String>{

}
