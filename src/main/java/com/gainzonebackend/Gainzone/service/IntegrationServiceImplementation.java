package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Integration;
import com.gainzonebackend.Gainzone.model.User;
import com.gainzonebackend.Gainzone.repository.IntegrationRepository;
import com.gainzonebackend.Gainzone.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegrationServiceImplementation implements IntegrationService{

    private final IntegrationRepository integrationRepository;
    private final UserRepository userRepository;

    public IntegrationServiceImplementation(IntegrationRepository integrationRepository, UserRepository userRepository) {
        this.integrationRepository = integrationRepository;
        this.userRepository = userRepository;
    }


    @Override
    public List<Integration> getAllIntegrations() {
        return integrationRepository.findAll();
    }

    @Override
    public Integration getByIntegrationId(Long id) {
        return integrationRepository.findIntegrationById(id);
    }



    @Override
    public Integration saveIntegration(Integration integration, Long userId) {
        User user = userRepository.findUserById(userId);
        integration.setUser(user);
        return integrationRepository.save(integration);
    }

    @Override
    public void removeById(Long id) {
        integrationRepository.deleteById(id);
    }

}
