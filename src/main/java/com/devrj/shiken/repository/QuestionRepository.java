package com.devrj.shiken.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devrj.shiken.model.MultiOptionQuestion;

public interface QuestionRepository extends MongoRepository<MultiOptionQuestion, String>{

}
