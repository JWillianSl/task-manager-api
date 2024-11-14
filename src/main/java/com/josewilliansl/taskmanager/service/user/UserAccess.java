package com.josewilliansl.taskmanager.service.user;

import com.josewilliansl.taskmanager.dto.user.RegisterUserRequest;
import com.josewilliansl.taskmanager.dto.user.UserResponse;

public interface UserAccess {
    
    public UserResponse register(RegisterUserRequest registerUserData);

}
