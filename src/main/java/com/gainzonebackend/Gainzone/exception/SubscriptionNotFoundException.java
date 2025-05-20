package com.gainzonebackend.Gainzone.exception;

public class SubscriptionNotFoundException extends RuntimeException{
    public SubscriptionNotFoundException(Long id){
        super
                ("Couldn't find a Subscription with id "+id);
    }
}
