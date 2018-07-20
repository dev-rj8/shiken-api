package com.devrj.shiken.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devrj.shiken.model.MultiOptionQuestion;
import com.devrj.shiken.model.QuestionPaper;
import com.devrj.shiken.model.User;
import com.devrj.shiken.repository.QuestionPaperRepository;
import com.devrj.shiken.repository.UserRepository;

@RestController
public class ShikenService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private QuestionPaperRepository paperRepository;
	
	@RequestMapping("/questions")
 	public String getQuestions() throws IOException {
		
		List<User> users =  repository.findAll();
		
		for(User u : users) {
			System.out.println(u.getFirstname() + ", "+ u.getLastname());
		}
		
		List<QuestionPaper> papers =  paperRepository.findAll();
		
		for(QuestionPaper qp : papers) {
			System.out.println("Paper Name : " + qp.getPaperName());
			for(MultiOptionQuestion q :  qp.getQuestions()) {
				System.out.println(q);				
			}
		}
		
		return "[ { 	id : 1, 	question : 'Is null a keyword in Java?', 	options : ['Yes', 'No'] }, { 	id : 2, 	question : 'Is Constructor inherited?', 	options : ['Yes', 'No'] }   ]";
 	}
	
}
