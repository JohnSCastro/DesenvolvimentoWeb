package com.example.Projeto_Web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto_Web.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
