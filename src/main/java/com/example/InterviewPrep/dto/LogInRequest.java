package com.example.InterviewPrep.dto;

public class LogInRequest {

    // Make LoginRequest static
    public static class LoginRequest {
        private String username;
        private String password;

        // Add no-args constructor (required for deserialization)
        public LoginRequest() {}

        // Getters and Setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}

