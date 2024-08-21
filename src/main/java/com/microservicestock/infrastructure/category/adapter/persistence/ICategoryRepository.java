package com.microservicestock.infrastructure.category.adapter.persistence;

import com.microservicestock.infrastructure.category.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {
    default boolean existsByName(String name) {
        return false;
    }
}