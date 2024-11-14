package com.josewilliansl.taskmanager.service.user;

import org.springframework.stereotype.Service;

import com.josewilliansl.taskmanager.dto.user.RegisterUserRequest;
import com.josewilliansl.taskmanager.dto.user.UserResponse;
import com.josewilliansl.taskmanager.repository.RoleRepository;
import com.josewilliansl.taskmanager.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserAccessService implements UserAccess{
    
    private UserRepository userRepository;

    private RoleRepository roleRepository;

    @Override
    public UserResponse register(RegisterUserRequest registerUserData) {
        return null;
    }

}