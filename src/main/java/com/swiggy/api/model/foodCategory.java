package com.swiggy.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class foodCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    private String categoryName;

    private String categoryUrl;
    public foodCategory(String categoryName, String categoryUrl) {
        this.categoryName = categoryName;
        this.categoryUrl = categoryUrl;
    }
}
