package com.Shop.Bird.web;


import com.Shop.Bird.Config.ResponseApi;
import com.Shop.Bird.DTOS.CategorieDTO;
import com.Shop.Bird.DTOS.ProductDTO;
import com.Shop.Bird.Models.Product;
import com.Shop.Bird.service.Categorieservice;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Objects;

@RestController
@AllArgsConstructor
@Slf4j
public class CategoryAPI {
 Categorieservice categorieservice;
    @GetMapping("/login")
    public String getrequest(){
        return "Welcome";
    }
    @PostMapping("/create")
    public String Addcategorie( @RequestBody CategorieDTO categorieDTO){
        this.categorieservice.saveCategorie(categorieDTO);
        return "seccess";
    }

    @GetMapping("/liste")
    public List<CategorieDTO> Allcategorie(){
        return this.categorieservice.GetCategories();
    }
    @DeleteMapping("/delete/{idcategory}")
    public String Deleteproducts(@PathVariable Long idcategory){
        this.categorieservice.deletecategory(idcategory);
        return "Success ";}
    @PutMapping("/update/{idcategorie}")
    public String Update(@PathVariable Long idcategorie, @RequestBody CategorieDTO categorieDTO){
        categorieDTO.setId(idcategorie);
        this.categorieservice.Updatecategorie(categorieDTO);
        return "Category updated Seccessfully";
    }
}
