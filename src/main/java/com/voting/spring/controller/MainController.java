package com.voting.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.voting.spring.model.VotingList;
import com.voting.spring.services.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping("/saveVoter")
	public String VotingCont(@ModelAttribute VotingList vote) {
		System.out.println(vote.getVote());
		System.out.println("hello home page");
		userService.saveVote(vote);
		return "redirect:/login";
	}

}
