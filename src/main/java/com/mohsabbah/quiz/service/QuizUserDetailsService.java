package com.mohsabbah.quiz.service;

import com.mohsabbah.quiz.model.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class QuizUserDetailsService implements UserDetailsService {

    private final Map<String,User> users = new HashMap<>();

    public QuizUserDetailsService() {
        users.put("admin", new User("admin", "password", "ADMIN"));
        users.put("user", new User("user", "password", "USER"));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = users.get(username);

        System.out.println("Looking for user: " + username);
        System.out.println("Found: " + user);

        if (user == null) throw new UsernameNotFoundException("user not found");

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password("{noop}" + user.getPassword())
                .roles(user.getRole())
                .build();
    }
}

