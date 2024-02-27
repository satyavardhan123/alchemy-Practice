package com.example.Springboot.service;

import java.util.List;

import com.example.Springboot.entity.Quiz;

public interface QuizService {

	public Quiz saveQuiz(Quiz quiz);

	public List<Quiz> getQuiz();

	public List<Quiz> getQuizByCategory(String category);

	public String result(Long id, String option);

	

}
