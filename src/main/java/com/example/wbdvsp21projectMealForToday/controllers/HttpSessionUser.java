package com.example.wbdvsp21projectMealForToday.controllers;

import com.example.wbdvsp21projectMealForToday.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
public class HttpSessionUser {
    List<User> users = new ArrayList<User>();

    @GetMapping("/api/register/{username}/{password}/{email}/{role}/{birthday}")
    public User register(@PathVariable("username") String username,
                         @PathVariable("password") String password,
                         @PathVariable("email") String email,
                         @PathVariable("role") String role,
                         @PathVariable("birthday") String birthday,
                         HttpSession session) {
        User user = new User(username, password, email, role, birthday);
        session.setAttribute("currUser", user);
        users.add(user);
        return user;
    }

    @GetMapping("/api/profile")
    public User profile(HttpSession session) {
        User currUser = (User) session.getAttribute("currUser");
        return currUser;
    }

    @GetMapping("/api/logout")
    public void logout (HttpSession session) {
        session.invalidate();
    }

    @GetMapping("/api/login/{username}/{password}/{email}/{role}/{birthday}")
    public User login(@PathVariable("username") String username,
                      @PathVariable("password") String password,
                      @PathVariable("email") String email,
                      @PathVariable("role") String role,
                      @PathVariable("birthday") String birthday,
                      HttpSession session) {
        for(User user : users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password) &&
                user.getEmail().equals(email) && user.getRole().equals(role) && user.getBirthday().equals(birthday)) {
                session.setAttribute("currentUser", user);
                return user;
            }
        }
        return null;
    }
}
