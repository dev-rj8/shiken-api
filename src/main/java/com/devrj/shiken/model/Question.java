package com.devrj.shiken.model;

import org.springframework.data.annotation.Id;

public class Question {
	
	@Id
	int id;
	String question;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
}
