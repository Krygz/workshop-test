package com.teste.demo.repository;

import com.teste.demo.entities.Category;
import com.teste.demo.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {


}
