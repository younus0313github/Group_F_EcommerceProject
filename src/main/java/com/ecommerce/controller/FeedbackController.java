package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Feedback;
import com.velocity.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/post")
	public ResponseEntity<Feedback> postUserFeedback(@RequestBody Feedback feedback) {

		Feedback feedback1 = feedbackService.postUserFeedback(feedback);

		return ResponseEntity.ok().body(feedback1);

	}
}
