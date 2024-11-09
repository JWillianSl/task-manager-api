package com.josewilliansl.taskmanager.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josewilliansl.taskmanager.entities.User;

public interface UserRepository extends JpaRepository<User, UUID>{
    
}
