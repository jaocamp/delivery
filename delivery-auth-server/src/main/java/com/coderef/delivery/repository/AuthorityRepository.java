package com.coderef.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderef.delivery.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}