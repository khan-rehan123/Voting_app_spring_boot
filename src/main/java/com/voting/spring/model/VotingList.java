package com.voting.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VotingList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String vote;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	public VotingList(int id, String vote) {
		super();
		this.id = id;
		this.vote = vote;
	}

	public VotingList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VotingList [id=" + id + ", vote=" + vote + "]";
	}

}
