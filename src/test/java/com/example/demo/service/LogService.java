package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Login;
import com.example.demo.repository.LogRepo;

@Service
public class LogService {

    @Autowired
    private LogRepo repository;

    public Login log(String username, String password)
    {
        Login user=repository.findByUsernameAndPassword(username,password);
        return user;
    }

}