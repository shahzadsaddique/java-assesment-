package com.assessment.repository;

import com.assessment.domain.AuthUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthUserRepository extends CrudRepository<AuthUser, Integer> {
	
	AuthUser findByUsername(String username);
	
}