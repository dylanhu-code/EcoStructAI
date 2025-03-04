package com.ecostructai.repository;

import com.ecostructai.model.InfrastructureData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfrastructureRepository extends JpaRepository<InfrastructureData, Long> {
}
