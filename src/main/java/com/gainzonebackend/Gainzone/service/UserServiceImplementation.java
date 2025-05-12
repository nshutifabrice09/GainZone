package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.User;
import com.gainzonebackend.Gainzone.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{


    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByMembershipId(String membershipId) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(String membershipId, User user) {
        return null;
    }

    @Override
    public void removeByMembershipId(String membershipId) {

    }
}
