package com.intimacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intimacy.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email); 

}
