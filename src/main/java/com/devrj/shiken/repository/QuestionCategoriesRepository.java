package com.devrj.shiken.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devrj.shiken.model.QuestionCategory;;

public interface QuestionCategoriesRepository extends MongoRepository<QuestionCategory, String>{

}
