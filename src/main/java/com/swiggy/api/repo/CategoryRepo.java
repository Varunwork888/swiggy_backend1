package com.swiggy.api.repo;

import com.swiggy.api.model.foodCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<foodCategory, Integer> {

}
