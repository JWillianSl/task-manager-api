package com.josewilliansl.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.josewilliansl.taskmanager.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
    
}
