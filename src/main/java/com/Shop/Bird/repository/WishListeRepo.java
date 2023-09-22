package com.Shop.Bird.repository;

import com.Shop.Bird.Models.WishListe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListeRepo extends JpaRepository<WishListe,Long> {
}
