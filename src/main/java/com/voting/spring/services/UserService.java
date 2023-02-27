package com.voting.spring.services;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.voting.spring.dto.UserRegistrationDto;
import  com.voting.spring.model.User;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
