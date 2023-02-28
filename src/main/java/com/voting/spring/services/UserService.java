package com.voting.spring.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.voting.spring.dto.UserRegistrationDto;
import com.voting.spring.model.User;
import com.voting.spring.model.VotingList;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

	VotingList saveVote(VotingList vote);
}
