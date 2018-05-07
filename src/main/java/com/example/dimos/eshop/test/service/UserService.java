package com.example.dimos.eshop.test.service;

import com.example.dimos.eshop.test.config.JwtTokenProvider;
import com.example.dimos.eshop.test.domain.User;
import com.example.dimos.eshop.test.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private AuthenticationManager authenticationManager;

    public String signin(String username, String password){
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            return jwtTokenProvider.createToken(username, userRepo.findByName(username).getRoles());
        } catch (AuthenticationException e) {
            return String.valueOf(e.getStackTrace());
        }
    }

    public String signup(User user) {
        if (!userRepo.existsByName(user.getName())){
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepo.save(user);
            return jwtTokenProvider.createToken(user.getName(), user.getRoles());
        } else {
            return "Username already in use";
        }
    }




}
