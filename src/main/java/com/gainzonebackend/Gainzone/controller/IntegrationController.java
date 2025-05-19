package com.gainzonebackend.Gainzone.controller;


import com.gainzonebackend.Gainzone.model.Integration;
import com.gainzonebackend.Gainzone.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class IntegrationController {

    private final IntegrationService integrationService;

    @Autowired
    public IntegrationController(IntegrationService integrationService) {
        this.integrationService = integrationService;
    }

    @PostMapping("/integration/{userId}")
    public Integration save(@RequestBody Integration integration, @PathVariable("userId")Long userId){
        return integrationService.saveIntegration(integration, userId);
    }

    @GetMapping("/integrations")
    public List<Integration> getAllIntegrations(){
        return integrationService.getAllIntegrations();
    }

    @GetMapping("/integration/{id}")
    public Integration getIntegrationById(@PathVariable("id") Long id){
        return integrationService.getByIntegrationId(id);
    }

    @PutMapping("/update/integration/{id}")
    public Integration updateIntegration(@PathVariable ("id") Long id, @RequestBody Integration integration){
        return integrationService.updateIntegration(id, integration);
    }

    @DeleteMapping("/delete/integrations/{id}")
    public void deleteById(@PathVariable ("id") Long id){
        integrationService.removeById(id);
    }

}
