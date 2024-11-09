package com.josewilliansl.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josewilliansl.taskmanager.entities.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    
}
