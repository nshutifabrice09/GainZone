package com.gainzonebackend.Gainzone.controller;


import com.gainzonebackend.Gainzone.service.IntegrationService;
import com.gainzonebackend.Gainzone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class IntegrationController {

    private final IntegrationService integrationService;
    private final UserService userService;

    @Autowired
    public IntegrationController(IntegrationService integrationService, UserService userService) {
        this.integrationService = integrationService;
        this.userService = userService;
    }


}
