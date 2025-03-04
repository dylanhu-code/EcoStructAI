package com.ecostructai.repository;

import com.ecostructai.model.EconomicData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EconomicRepository extends JpaRepository<EconomicData, Long> {
}
