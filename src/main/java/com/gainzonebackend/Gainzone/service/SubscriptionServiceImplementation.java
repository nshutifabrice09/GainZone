package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Subscription;
import com.gainzonebackend.Gainzone.model.User;
import com.gainzonebackend.Gainzone.repository.SubscriptionRepository;
import com.gainzonebackend.Gainzone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImplementation implements SubscriptionService{

    private final SubscriptionRepository subscriptionRepository;
    private final UserRepository userRepository;

    @Autowired
    public SubscriptionServiceImplementation(SubscriptionRepository subscriptionRepository, UserRepository userRepository){
        this.subscriptionRepository = subscriptionRepository;
        this.userRepository = userRepository;
    }
    @Override
    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    @Override
    public Subscription getSubscriptionById(Long id) {
        return null;
    }

    @Override
    public Subscription saveSubscription(Subscription subscription, Long userId) {
        User user = userRepository.findUserById(userId);
        subscription.setUser(user);
        return subscriptionRepository.save(subscription);
    }


    @Override
    public Subscription updateSubscription(Long id, Subscription subscription) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
