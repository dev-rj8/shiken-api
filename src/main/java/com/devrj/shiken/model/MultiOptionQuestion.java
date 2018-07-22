package com.devrj.shiken.model;

import java.util.Arrays;


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
		return getQuestion()+ "   options : "+ Arrays.toString(options);
	}
}
