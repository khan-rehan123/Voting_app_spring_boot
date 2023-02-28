package com.voting.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voting.spring.model.VotingList;

public interface VoteRepository extends JpaRepository<VotingList, Integer>{

}
