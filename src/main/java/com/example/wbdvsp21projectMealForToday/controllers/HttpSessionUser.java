package com.example.wbdvsp21projectMealForToday.controllers;

import com.example.wbdvsp21projectMealForToday.dto.UserRegisterDto;
import com.example.wbdvsp21projectMealForToday.models.User;
import com.example.wbdvsp21projectMealForToday.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
//@CrossOrigin(origins = "*") , allowCredentials = "true"
public class HttpSessionUser {
    List<User> users = new ArrayList<>();

    @Autowired
    UserService service;

    @PostMapping("/api/register")
    public User register(@RequestBody User user,
                         HttpSession session) {
        User newUser = service.register(user);
        session.setAttribute("currUser", newUser);
        users.add(user);
        return newUser;
    }

    @PostMapping("/api/profile")
    public User profile(HttpSession session) {
        User currUser = (User) session.getAttribute("currUser");
        return currUser;
    }

    @PostMapping("/api/logout")
    public void logout (HttpSession session) {
        session.invalidate();
    }

    @PostMapping("/api/login")
    public User login(	@RequestBody User credentials,
                          HttpSession session) {
        for (User user : users) {
            if( user.getUsername().equals(credentials.getUsername())
                    && user.getPassword().equals(credentials.getPassword())) {
                session.setAttribute("currUser", user);
                return user;
            }
        }
        return null;
    }

}
