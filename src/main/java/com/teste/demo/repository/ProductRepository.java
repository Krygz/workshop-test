package com.teste.demo.repository;

import com.teste.demo.entities.Category;
import com.teste.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
