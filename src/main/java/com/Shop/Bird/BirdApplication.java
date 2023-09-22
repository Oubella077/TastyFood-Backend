package com.Shop.Bird;

import com.Shop.Bird.DTOS.CategorieDTO;
import com.Shop.Bird.service.Categorieservice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class BirdApplication {

    public static void main(String[] args) {
        SpringApplication.run(BirdApplication.class, args);
    }


    //@Bean
    CommandLineRunner commandLineRunner(Categorieservice categorieservice) {
        return args -> {
            Stream.of("cake", "juice", "meal").forEach(
                    name -> {
                        CategorieDTO categorieDTO = new CategorieDTO();
                        categorieDTO.setName(name);
                        categorieDTO.setImageUrl(name + "@gmail.com");
                        categorieservice.saveCategorie(categorieDTO);
                    });

        };
    }
}