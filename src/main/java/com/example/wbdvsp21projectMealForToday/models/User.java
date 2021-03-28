package com.example.wbdvsp21projectMealForToday.models;

public class User {
    private String username;
    private String password;
    private String email;
    private String role;
    private String birthday;

    public User(String username, String password, String email, String role, String birthday) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.birthday = birthday;
    }

    public User() {
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
