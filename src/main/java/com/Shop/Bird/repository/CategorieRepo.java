package com.Shop.Bird.repository;

import com.Shop.Bird.Models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepo extends JpaRepository<Categorie,Long> {
    Categorie findByName(String categoryName);
}
