package com.Shop.Bird.DTOS;

import com.Shop.Bird.Models.Customer;
import com.Shop.Bird.Models.Product;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
public class WishListeDTO {
    private Long Id;
    private Customer customer;
    private Date createdDate;
    private Product product;
}
