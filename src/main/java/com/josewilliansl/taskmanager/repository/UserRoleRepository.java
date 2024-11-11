package com.josewilliansl.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josewilliansl.taskmanager.entities.Role;

public interface UserRoleRepository extends JpaRepository<Role, Long> {
    
}
