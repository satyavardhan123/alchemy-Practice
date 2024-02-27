package com.example.Springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springboot.entity.Quiz;
@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long>{

	List<Quiz> findByCategory(String category);

}
