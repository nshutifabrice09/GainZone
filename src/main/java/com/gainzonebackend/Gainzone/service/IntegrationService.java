package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Integration;

import java.util.List;

public interface IntegrationService {
    List<Integration> getAllIntegrations();
    Integration getByIntegrationId(String integrationId);
    Integration saveIntegration(Integration integration, Long userId);
    void removeById(Long id);
}
