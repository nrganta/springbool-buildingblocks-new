package com.stacksimply.restservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimply.restservices.entities.User;

//Repository
@Repository
public interface UserRepository  extends JpaRepository<com.stacksimply.restservices.entities.User, Long>{

	com.stacksimply.restservices.entities.User findByUsername(String username);
}