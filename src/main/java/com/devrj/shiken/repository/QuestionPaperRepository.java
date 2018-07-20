package com.devrj.shiken.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devrj.shiken.model.QuestionPaper;

public interface QuestionPaperRepository extends MongoRepository<QuestionPaper, String>{

}
