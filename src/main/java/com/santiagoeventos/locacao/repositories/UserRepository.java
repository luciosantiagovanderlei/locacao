package com.santiagoeventos.locacao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiagoeventos.locacao.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
