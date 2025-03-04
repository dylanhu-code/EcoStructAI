package com.ecostructai.controller;

import com.ecostructai.model.InfrastructureData;
import com.ecostructai.service.InfrastructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/infrastructure")
public class InfrastructureController {

    @Autowired
    private InfrastructureService infrastructureService;

    @GetMapping("/{id}")
    public InfrastructureData getInfrastructureData(@PathVariable Long id) {
        return infrastructureService.getInfrastructureData(id);
    }
}
