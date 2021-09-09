package com.scit.quiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class QuizController {
	
	
	@RequestMapping("/quiz")
	public String quiz() {
		
		return "quiz/quizlist";
	}

}
