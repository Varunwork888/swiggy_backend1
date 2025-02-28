package com.swiggy.api.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swiggy.api.model.foodCategory;
import com.swiggy.api.repo.CategoryRepo;
import com.swiggy.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public List<foodCategory> getAllCategory() {
        List<foodCategory> data=categoryRepo.findAll();
        return data;
    }
    public void testSerialization() throws Exception {
        List<foodCategory> categories = getAllCategory();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(categories);
        System.out.println("Serialized JSON: " + json);
    }
}
