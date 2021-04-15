package com.example.wbdvsp21projectMealForToday.services;

import com.example.wbdvsp21projectMealForToday.dto.UserRegisterDto;
import com.example.wbdvsp21projectMealForToday.models.User;
import com.example.wbdvsp21projectMealForToday.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public User save(UserRegisterDto registerDto) {
//        User user = new User(registerDto.getUsername(), registerDto.getPassword(), registerDto.getEmail(),
//                registerDto.getRole(), registerDto.getBirthday());
//        return userRepository.save(user);
//    }

    public User register(User user) {
        return userRepository.save(user);
    }

    public List<User> findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
