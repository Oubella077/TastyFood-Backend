package com.Shop.Bird.repository;

import com.Shop.Bird.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
