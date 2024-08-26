package com.microservicestock.infrastructure.brand.adapter.persistence;

import com.microservicestock.infrastructure.brand.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<BrandEntity, Long> {
    boolean existsByName(String name);
}