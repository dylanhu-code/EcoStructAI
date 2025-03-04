package com.ecostructai.service;

import com.ecostructai.model.EconomicData;
import com.ecostructai.repository.EconomicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EconomicService {
    @Autowired
    private EconomicRepository economicRepository;

    public EconomicData getEconomicData(Long id) {
        return economicRepository.findById(id).orElse(null);
    }
}
