package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserByMembershipId(String membershipId) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(String membershipId, User user) {
        return null;
    }

    @Override
    public void removeByMembershipId(String membershipId) {

    }
}
