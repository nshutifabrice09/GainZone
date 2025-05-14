package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Subscription;

import java.util.List;

public interface SubscriptionService {
    List<Subscription> getAllSubscriptions();
    Subscription getSubscriptionById(Long id);
    Subscription saveSubscription(Subscription subscription, Long userId);
    Subscription updateSubscription(Long id, Subscription subscription);
    void removeById(Long id);
}
