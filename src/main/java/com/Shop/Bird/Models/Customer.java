package com.Shop.Bird.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;
@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class Customer {
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    @Column( unique = true)
    private String Identifier;
    @NonNull
    private String firstname;
    @NonNull
    private String lastname;
    @NonNull
    @Column( unique = true)
    private String email;
    @NonNull
    private LocalDate Birthdate;
    @JoinColumn(name="product_id")
    @OneToOne
    private Product product;
}