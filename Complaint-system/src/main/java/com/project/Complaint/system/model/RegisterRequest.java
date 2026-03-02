package com.project.Complaint.system.model;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String phone;
    private Role role; // CITIZEN, OFFICER, VENDOR, ADMIN
}
