package com.springTest.SpringDataJPA_Rel_Ex2.services;

import com.springTest.SpringDataJPA_Rel_Ex2.models.Profile;
import com.springTest.SpringDataJPA_Rel_Ex2.models.User;
import com.springTest.SpringDataJPA_Rel_Ex2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User createUserWithProfile(String userName, String bio) {
        User user = new User(userName);
        Profile profile = new Profile(bio);
        user.setProfile(profile);
        profile.setUser(user); // This is for bidirectional consistency
        return repo.save(user); // Saving user cascades to profile
    }
    public Optional<User> findUserById(Integer userId) {
        return repo.findById(userId);
    }

    public Optional<User> findUserByName(String userName){
        return repo.findByName(userName);
    }

}
