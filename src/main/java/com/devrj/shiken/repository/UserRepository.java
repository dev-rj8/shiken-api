package com.devrj.shiken.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

//https://dzone.com/articles/spring-data-mongodb-hello
public interface UserRepository extends MongoRepository<User, String>{

}
