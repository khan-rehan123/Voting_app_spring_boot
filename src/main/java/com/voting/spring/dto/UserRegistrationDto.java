package com.voting.spring.dto;

public class UserRegistrationDto {
	private String firstName;
	private String email;
	private String password;
	private long contact;
	private String vote; 
	
	public UserRegistrationDto(){
		
	}
	
	public UserRegistrationDto(String firstName, String email, String password ,long contact,String vote) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.contact=contact;
		this.vote=vote;
	}
	
	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
}
