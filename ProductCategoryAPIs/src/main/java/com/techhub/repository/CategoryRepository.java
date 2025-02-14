package com.techhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.techhub.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
