package com.devrj.shiken.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShikenService {
	
	@RequestMapping("/questions")
	public String getQuestions() {
		
		return "[{id : 1, question : Who is founder of Java?, options : [ Charles babez, Javin Paul, James Gosling]}]";
	}
	
}
