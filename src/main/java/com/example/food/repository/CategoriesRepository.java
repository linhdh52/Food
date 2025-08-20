package com.example.food.repository;

import com.example.food.entity.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<CategoriesEntity, Long> {
    boolean existsByName(String name);

    boolean existsBySlug(String slug);
}
