package com.example.Springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springboot.entity.Quiz;
import com.example.Springboot.service.QuizService;

@RestController
@RequestMapping("quiz")
public class QuizController {
	@Autowired
	private QuizService quizservice;
	
	@PostMapping("create")
	public Quiz saveQuiz(@RequestBody Quiz quiz) {
		return quizservice.saveQuiz(quiz);
	}
	@GetMapping("get")
	public List<Quiz> getQuiz(){
		return quizservice.getQuiz();
	}
	@GetMapping("get/{category}")
	public List<Quiz> getQuizByCategory(@PathVariable("category") String category){
		return quizservice.getQuizByCategory(category);
	}
	@GetMapping("get/{id}/{option}")
	public String result(@PathVariable("id") Long id,@PathVariable("option") String option) {
		String ans=quizservice.result(id,option);
		
		return ans;
	}

}
