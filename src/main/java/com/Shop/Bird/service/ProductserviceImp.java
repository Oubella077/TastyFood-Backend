package com.Shop.Bird.service;

import com.Shop.Bird.DTOS.ProductDTO;
import com.Shop.Bird.Mappers.MapperImp;
import com.Shop.Bird.Models.Product;
import com.Shop.Bird.exception.BadRequestException;
import com.Shop.Bird.repository.ProductRepo;
import com.Shop.Bird.service.Productservice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
@Slf4j
public class ProductserviceImp implements Productservice {
    ProductRepo productRepo;

    @Override
    public Product Addproduct(ProductDTO productDTO) {
        try {
            Product product = MapperImp.fromproductDTO(productDTO);
            return productRepo.save(product);
        } catch (Exception e) {
            throw new BadRequestException("error for saving product");
        }
    }

    @Override
    public void Deleteproduct(Long Idproduct) {
        try {
            productRepo.deleteById(Idproduct);
        } catch (Exception e) {
            throw new BadRequestException("error for deleting product");
        }

    }



    @Override
    public Product Updateproduct(Long id, ProductDTO productDTO) {
        ProductDTO productRequest = findById(id);
        productRequest.setName(productDTO.getName());
        productRequest.setPrice(productDTO.getPrice());
        productRequest.setImageURL(productDTO.getImageURL());
        productRequest.setDescription(productRequest.getDescription());
        Product product = MapperImp.fromproductDTO(productRequest);
        return productRepo.save(product);
    }

    public ProductDTO findById(Long id) {
        try {
            Product product = productRepo.findById(id).get();
            return MapperImp.fromproduct(product);
        } catch (Exception e) {
            throw new BadRequestException("error finding product by id ");
        }

    }

    @Override
    public List<ProductDTO> GetAllproduct() {
        List<Product> products = productRepo.findAll();
        List<ProductDTO> productDTOS = products.stream().map(pro -> MapperImp.fromproduct(pro)).collect(Collectors.toList());
        return productDTOS;
    }

}
