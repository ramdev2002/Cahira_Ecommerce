package com.ecommerce.cahira.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {
    private Integer id;
    private String name;
    private Integer categoryId;
    private Integer price;
    private Integer stock;
    private String brand;
    private String description;
    private String imageName;
}
