package com.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Product.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
