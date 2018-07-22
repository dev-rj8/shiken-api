package com.devrj.shiken.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devrj.shiken.model.MultiOptionQuestion;
import com.devrj.shiken.model.QuestionCategory;
import com.devrj.shiken.model.User;
import com.devrj.shiken.repository.QuestionCategoriesRepository;
import com.devrj.shiken.repository.QuestionRepository;
import com.devrj.shiken.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class ShikenService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private QuestionCategoriesRepository categoryRepo;
	
	@Autowired
	private QuestionRepository questionRepo;
	
	@RequestMapping(value="/users", method = RequestMethod.GET)
 	public List<User> getUsers() throws IOException {
		
		List<User> users =  userRepo.findAll();
		
		return users;
	}
	
	@RequestMapping(value= "/courses", method = RequestMethod.GET)
 	public List<QuestionCategory> getCategories() throws IOException {
		
		List<QuestionCategory> categories = categoryRepo.findAll();
		
		return categories;
 	}
	
	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public List<MultiOptionQuestion> getQuestions() throws JsonProcessingException {
		
		List<MultiOptionQuestion> questions = questionRepo.findAll();
		
		return questions;
	}
	
}
