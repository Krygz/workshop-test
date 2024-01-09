package com.teste.demo.repository;

import com.teste.demo.entities.Category;
import com.teste.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {


}
