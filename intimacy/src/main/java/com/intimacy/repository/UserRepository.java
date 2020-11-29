package com.intimacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intimacy.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

}
