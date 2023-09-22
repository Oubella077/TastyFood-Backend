package com.Shop.Bird.web;


import com.Shop.Bird.DTOS.ProductDTO;
import com.Shop.Bird.service.Productservice;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
@Slf4j
public class ProductAPI {
    Productservice productservice;

    @PostMapping("/create")
    public String Addproduct(@RequestBody ProductDTO productDTO) {
        this.productservice.Addproduct(productDTO);
        return "Success ";
    }

    @GetMapping("/liste")
    public List<ProductDTO> Getproducts() {
        return this.productservice.GetAllproduct();
    }

    @DeleteMapping("/delete/{idproduct}")
    public String Deleteproducts(@PathVariable Long idproduct) {
        this.productservice.Deleteproduct(idproduct);
        return "Success ";
    }

    @PutMapping("/update/{idproduct}")
    public String Updateproducts(@PathVariable Long idproduct, @RequestBody ProductDTO productDTO) {
        this.productservice.Updateproduct(idproduct,productDTO);
        return "Success ";
    }

}
