package com.swiggy.api.service.impl;

import com.swiggy.api.model.foodCategory;
import com.swiggy.api.repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CloudinaryImageDatabaseService {
    @Autowired
    private CategoryRepo categoryRepo;

    public foodCategory saveImage(String name, String url) {
        try {
            foodCategory category = new foodCategory(name, url);
            return categoryRepo.save(category);
        } catch (Exception e) {
            System.out.println("Image is not stored in database");
            e.printStackTrace(); // Logs the actual error
        }
        return null; // Ensure method always returns something
    }
}
