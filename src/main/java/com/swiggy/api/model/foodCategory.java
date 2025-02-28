package com.swiggy.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class foodCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("categoryId")
    private int categoryId;
    @JsonProperty("categoryName")
    private String categoryName;
    @JsonProperty("categoryUrl")
    private String categoryUrl;
    public foodCategory(String categoryName, String categoryUrl) {
        this.categoryName = categoryName;
        this.categoryUrl = categoryUrl;
    }
    public foodCategory() {
    }
}
