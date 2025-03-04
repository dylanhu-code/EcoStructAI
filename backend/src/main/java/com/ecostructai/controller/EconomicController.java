package com.ecostructai.controller;

import com.ecostructai.model.EconomicData;
import com.ecostructai.service.EconomicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/economic")
public class EconomicController {

    @Autowired
    private EconomicService economicService;

    @GetMapping("/{id}")
    public EconomicData getEconomicData(@PathVariable Long id) {
        return economicService.getEconomicData(id);
    }
}