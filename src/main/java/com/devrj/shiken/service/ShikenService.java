package com.devrj.shiken.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShikenService {
	
	@RequestMapping("/questions")
	public String getQuestions() throws IOException {
		
		String fileName = "java_questions.json";
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        
        //File is found
        System.out.println("File Found : " + file.exists());
        
        //Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
		return content;		
	}
	
}