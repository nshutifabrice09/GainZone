package com.gainzonebackend.Gainzone.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String membershipId){
        super
                ("Coudln't find a User with membershipId "+membershipId);
    }
}
