package com.devrj.shiken.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "question_papers")
public class QuestionPaper {
	
	private String id;
	
	private String paperName;
	
	private MultiOptionQuestion questions[];
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MultiOptionQuestion[] getQuestions() {
		return questions;
	}

	public void setQuestions(MultiOptionQuestion[] questions) {
		this.questions = questions;
	}

	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	

}
