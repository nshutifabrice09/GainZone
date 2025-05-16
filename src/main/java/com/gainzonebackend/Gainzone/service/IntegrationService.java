package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Integration;

import java.util.List;

public interface IntegrationService {
    List<Integration> getAllIntegrations();
    Integration getByIntegrationId(Long id);
    Integration saveIntegration(Integration integration, Long userId);
    Integration updateIntegration(Long id, Integration integration);
    void removeById(Long id);
}
