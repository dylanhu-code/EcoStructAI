package com.ecostructai.service;

import com.ecostructai.model.InfrastructureData;
import com.ecostructai.repository.InfrastructureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfrastructureService {
    @Autowired
    private InfrastructureRepository infrastructureRepository;

    public InfrastructureData getInfrastructureData(Long id) {
        return infrastructureRepository.findById(id).orElse(null);
    }
}
