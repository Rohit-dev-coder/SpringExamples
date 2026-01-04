package com.springTest.SpringDataJPA_Rel_Ex1.service;

import com.springTest.SpringDataJPA_Rel_Ex1.models.User;
import com.springTest.SpringDataJPA_Rel_Ex1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void AddUser(User u){
        userRepo.save(u);
    }

    public Optional<User> findUserById(Integer userId) {
        return userRepo.findById(userId);
    }


}
