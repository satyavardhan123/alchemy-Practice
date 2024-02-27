package com.example.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String category;
	private String question;
	private String option1;
	private String option2;
	private String correctoption;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getCorrectoption() {
		return correctoption;
	}
	public void setCorrectoption(String correctoption) {
		this.correctoption = correctoption;
	}
	public Quiz(Long id, String category, String question, String option1, String option2, String correctoption) {
		this.id = id;
		this.category = category;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.correctoption = correctoption;
	}
	public Quiz() {
		
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", category=" + category + ", question=" + question + ", option1=" + option1
				+ ", option2=" + option2 + ", correctoption=" + correctoption + "]";
	}
	


}
