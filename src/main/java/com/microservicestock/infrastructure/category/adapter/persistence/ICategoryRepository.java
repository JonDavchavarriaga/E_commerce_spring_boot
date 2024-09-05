package com.microservicestock.infrastructure.category.adapter.persistence;

import com.microservicestock.infrastructure.category.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {
     boolean existsByName(String name);
}
