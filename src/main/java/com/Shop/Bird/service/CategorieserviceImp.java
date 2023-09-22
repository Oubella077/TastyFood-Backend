package com.Shop.Bird.service;

import com.Shop.Bird.DTOS.CategorieDTO;
import com.Shop.Bird.Mappers.MapperImp;
import com.Shop.Bird.Models.Categorie;
import com.Shop.Bird.exception.BadRequestException;
import com.Shop.Bird.repository.CategorieRepo;

import com.Shop.Bird.service.Categorieservice;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolationException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.UnexpectedRollbackException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@AllArgsConstructor
public class CategorieserviceImp implements Categorieservice {
    CategorieRepo categorieRepo;
    @Override
    public Categorie saveCategorie(CategorieDTO categorieDTO)  {
   try {
       Categorie categorie=MapperImp.fromcategorieDTO(categorieDTO);
        return categorieRepo.save(categorie);
   }catch (Exception e) {
            throw new BadRequestException("error for saving product");
        }
    }
    @Override
    public List<CategorieDTO> GetCategories() {
        try {  List<Categorie> categories=this.categorieRepo.findAll();
       List<CategorieDTO> categorieDTOS=categories.stream().map(cat->MapperImp.fromcategorie(cat)).collect(Collectors.toList());
    return categorieDTOS;}catch (Exception e) {
            throw new BadRequestException("error for saving product");
        }
    }
    @Override
    public String Updatecategorie(CategorieDTO categorieDTO) {
        Categorie categorie=MapperImp.fromcategorieDTO(categorieDTO);
        this.categorieRepo.save(categorie);
        return "Success";
    }
    @Override
    public CategorieDTO readCategory(String categoryName) {
        Categorie categorie=categorieRepo.findByName(categoryName);
        return MapperImp.fromcategorie(categorie);
    }
    @Override
    public void deletecategory(Long idcategory) {
        this.categorieRepo.deleteById(idcategory);
    }
}




