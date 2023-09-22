package com.Shop.Bird.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WishListe {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "costumer_id")
    private Customer customer;
    private Date createdDate;
    @JoinColumn(name = "product_id")
    @ManyToOne
    private Product product;

}
