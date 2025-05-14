package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Subscription;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImplementation implements SubscriptionService{
    @Override
    public List<Subscription> getAllSubscriptions() {
        return null;
    }

    @Override
    public Subscription getSubscriptionById(Long id) {
        return null;
    }

    @Override
    public Subscription saveSubscription(Subscription subscription, Long userId) {
        return null;
    }


    @Override
    public Subscription updateSubscription(Long id, Subscription subscription) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
