package com.teste.demo.service;

import com.teste.demo.entities.Category;
import com.teste.demo.entities.User;
import com.teste.demo.repository.CategoryRepository;
import com.teste.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
      return categoryRepository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> obj = categoryRepository.findById(id);
       return obj.get();
    }



}
