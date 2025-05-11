package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserByMembershipId(String membershipId);
    User saveUser(User user);
    User updateUser(String membershipId, User user);
    void removeByMembershipId(String membershipId);
}
