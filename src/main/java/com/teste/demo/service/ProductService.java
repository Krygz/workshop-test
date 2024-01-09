package com.teste.demo.service;

import com.teste.demo.entities.Category;
import com.teste.demo.entities.Product;
import com.teste.demo.repository.CategoryRepository;
import com.teste.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository  productRepository;

    public List<Product> findAll(){
      return productRepository.findAll();
    }

    public Product findById(Long id){
       Optional<Product> obj = productRepository.findById(id);
       return obj.get();
    }



}
