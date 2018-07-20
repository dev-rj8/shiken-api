package com.devrj.shiken.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shiken")
public class MultiOptionQuestion extends Question{
	
	
	
	private String[] options;

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}
	
	@Override
	public String toString() {
		return question+ "   options : "+ Arrays.toString(options);
	}
}
