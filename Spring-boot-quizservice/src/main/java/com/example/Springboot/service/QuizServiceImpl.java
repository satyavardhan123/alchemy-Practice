package com.example.Springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springboot.entity.Quiz;
import com.example.Springboot.repository.QuizRepository;
@Service
public class QuizServiceImpl implements QuizService{
	@Autowired
	private QuizRepository quizrepository;

	@Override
	public Quiz saveQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return quizrepository.save(quiz);
	}

	@Override
	public List<Quiz> getQuiz() {
		// TODO Auto-generated method stub
		return quizrepository.findAll();
	}

	@Override
	public List<Quiz> getQuizByCategory(String category) {
		// TODO Auto-generated method stub
		return quizrepository.findByCategory(category);
	}

	@Override
	public String result(Long id, String option) {
		// TODO Auto-generated method stub
		Quiz quiz=quizrepository.findById(id).get();
		String s=quiz.getCorrectoption();
		if(s.equalsIgnoreCase(option)) {
		    return "You chose correct";
		}
		else {
			return "You chose wrong";
		}
	}

	

}
