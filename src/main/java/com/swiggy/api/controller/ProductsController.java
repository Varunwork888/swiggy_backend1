package com.swiggy.api.controller;

import com.swiggy.api.model.foodCategory;
import com.swiggy.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class ProductsController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
       public ResponseEntity<List<foodCategory>> getallcategory(){
        List<foodCategory> temp=productService.getAllCategory();
        return ResponseEntity.ok(temp);
    }
}
