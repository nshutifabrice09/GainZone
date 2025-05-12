package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.model.Subscription;
import com.gainzonebackend.Gainzone.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class SubscriptionController {
    private final SubscriptionService subscriptionService;

    @Autowired
    public SubscriptionController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping("/subscription/{userId}")
    public Subscription saveSubscription(@RequestBody Subscription subscription) {
        return subscriptionService.saveSubscription(subscription);
    }

    @GetMapping("/subscriptions")
    public List<Subscription> subscriptionList() {
        return subscriptionService.getAllSubscriptions();
    }

    @GetMapping("/subscription/{id}")
    public Subscription getSubscriptionById(@PathVariable("id") Long id) {
        return subscriptionService.getSubscriptionById(id);
    }

    @DeleteMapping("/subscription/{id}")
    public void removeById(@PathVariable("id") Long id) {
        subscriptionService.removeById(id);
    }

}
