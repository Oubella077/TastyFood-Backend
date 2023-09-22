package com.Shop.Bird.Mappers;

import com.Shop.Bird.DTOS.CategorieDTO;
import com.Shop.Bird.DTOS.ProductDTO;
import com.Shop.Bird.Models.Categorie;
import com.Shop.Bird.Models.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class MapperImp {
    public static CategorieDTO fromcategorie(Categorie categorie) {
        CategorieDTO categorieDTO = new CategorieDTO();
        BeanUtils.copyProperties(categorie, categorieDTO);
        return categorieDTO;
    }

    public static Categorie fromcategorieDTO(CategorieDTO categorieDTO) {
        Categorie categorie = new Categorie();
        BeanUtils.copyProperties(categorieDTO, categorie);
        return categorie;
    }

    public static Product fromproductDTO(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);
        return product;
    }

    public static ProductDTO fromproduct(Product product) {
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product, productDTO);
        return productDTO;
    }
}
