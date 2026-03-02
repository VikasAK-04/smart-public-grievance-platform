package com.project.Complaint.system.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private String username;
    private Role role;
    private String message;
}
