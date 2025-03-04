package com.ecostructai.model;

import jakarta.persistence.*;

@Entity
public class InfrastructureData {
    @Id
    private Long id;
    private String region;
    private double infrastructureHealthScore;
    private String riskLevel;

    // No-argument constructor (required by JPA)
    public InfrastructureData() {}

    // All-arguments constructor
    public InfrastructureData(String region, double infrastructureHealthScore, String riskLevel) {
        this.region = region;
        this.infrastructureHealthScore = infrastructureHealthScore;
        this.riskLevel = riskLevel;
    }
}
