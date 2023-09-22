package com.Shop.Bird.DTOS;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class ProductDTO {
    private Long id;
    private  String name;
    private  String imageURL;
    private  double price;
    private  String description;
}
