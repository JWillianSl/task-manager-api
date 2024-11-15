package com.josewilliansl.taskmanager.service.user;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.josewilliansl.taskmanager.dto.user.RegisterUserRequest;
import com.josewilliansl.taskmanager.dto.user.UserResponse;
import com.josewilliansl.taskmanager.entities.Role;
import com.josewilliansl.taskmanager.entities.User;
import com.josewilliansl.taskmanager.repository.RoleRepository;
import com.josewilliansl.taskmanager.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserAccessService implements UserAccess {

    private UserRepository userRepository;

    private RoleRepository roleRepository;

    @Override
    public UserResponse register(RegisterUserRequest registerUserData) {
        Role basicRole = roleRepository.findByName("COMMON");

        User newUser = User.builder().fullName(registerUserData.fullName()).username(registerUserData.nickName())
                .dateOfBirth(null).email(registerUserData.email()).password(registerUserData.password())
                .roles(Set.of(basicRole)).build();
        
        userRepository.save(newUser);

        return new UserResponse(newUser.getFullName(), newUser.getUsername(), newUser.getEmail());
    }

}