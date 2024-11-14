package com.josewilliansl.taskmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.josewilliansl.taskmanager.dto.user.RegisterUserRequest;
import com.josewilliansl.taskmanager.dto.user.UserResponse;
import com.josewilliansl.taskmanager.service.user.UserAccess;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private UserAccess userAccess;

    @PostMapping("/register")
    public ResponseEntity<UserResponse> postMethodName(@RequestBody @Valid RegisterUserRequest registerUserDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userAccess.register(registerUserDto));
    }

}
