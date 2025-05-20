package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.User;
import com.gainzonebackend.Gainzone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {


    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByMembershipId(String membershipId) {
        return userRepository.findByMembershipId(membershipId);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(String membershipId, User user) {
        User existUser = userRepository.findByMembershipId(membershipId);
        if (existUser != null) {
            existUser.setMembershipId(user.getMembershipId());
            existUser.setFirstName(user.getFirstName());
            existUser.setLastName(user.getLastName());
            existUser.setEmail(user.getEmail());
            existUser.setPhoneNumber(user.getPhoneNumber());
            existUser.setPassword(user.getPassword());
            existUser.setAddress(user.getAddress());
            existUser.setAge(user.getAge());
            existUser.setWeight(user.getWeight());
            return userRepository.save(existUser);
        }return null;
    }


    @Override
    public void removeByMembershipId(String membershipId) {
        userRepository.removeByMembershipId(membershipId);
    }
}
