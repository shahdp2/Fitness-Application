package com.fitness.userservice.dto;

import java.time.LocalDateTime;
import lombok.Data;
import com.fitness.userservice.models.User;

@Data
public class UserResponse {
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
