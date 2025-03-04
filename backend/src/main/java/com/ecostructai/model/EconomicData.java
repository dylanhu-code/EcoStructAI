package com.ecostructai.model;

import jakarta.persistence.*;
@Entity
public class EconomicData {

    @Id
    private Long id;
    private String region;
    private double gdp;
    private double unemploymentRate;
    private String growthTrend;

    // No-argument constructor (required by JPA)
    public EconomicData() {
    }

    // All-arguments constructor
    public EconomicData(String region, double gdp, double unemploymentRate, String growthTrend) {
        this.region = region;
        this.gdp = gdp;
        this.unemploymentRate = unemploymentRate;
        this.growthTrend = growthTrend;
    }
}
