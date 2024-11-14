package com.josewilliansl.taskmanager.dto.user;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@NotBlank()
public record RegisterUserRequest(@NotBlank(message = "Full name is not defined.") String fullName,
        @NotBlank(message = "Nick name is not defined.") String nickName,
        @NotBlank(message = "Date of birth is not defined.") LocalDate dateOfBirth,
        @NotBlank(message = "Email is not defined.") String email,
        @NotBlank(message = "Password is not defined.") @Pattern(regexp = "\\S\\d\\w{8,}") String password) {
}
