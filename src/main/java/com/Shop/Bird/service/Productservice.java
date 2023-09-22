package com.Shop.Bird.service;

import com.Shop.Bird.DTOS.ProductDTO;
import com.Shop.Bird.Models.Product;

import java.util.List;

public interface Productservice {
    public Product Addproduct(ProductDTO productDTO);
    public void Deleteproduct(Long Idproduct);
    public Product Updateproduct(Long id,ProductDTO productDTO);
    public List<ProductDTO> GetAllproduct();

}
