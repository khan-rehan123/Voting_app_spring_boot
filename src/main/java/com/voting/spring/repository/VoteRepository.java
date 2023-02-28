package com.voting.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voting.spring.model.VotingList;

@Repository
public interface VoteRepository extends JpaRepository<VotingList, Integer>{

}
