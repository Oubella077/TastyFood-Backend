package com.Shop.Bird.service;

import com.Shop.Bird.DTOS.CategorieDTO;
import com.Shop.Bird.Models.Categorie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Categorieservice {
  Categorie saveCategorie(CategorieDTO categorieDTO);
    List<CategorieDTO> GetCategories();
    String Updatecategorie(CategorieDTO categorieDTO);

  CategorieDTO readCategory(String categoryName);

  void deletecategory(Long idcategory);
}
