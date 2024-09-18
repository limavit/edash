package com.andromeda.edash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andromeda.edash.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);

}
