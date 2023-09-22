package com.Shop.Bird.DTOS;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CategorieDTO {

    private Long Id;
    private String name;
    private String Description;
    private String ImageUrl;

}
