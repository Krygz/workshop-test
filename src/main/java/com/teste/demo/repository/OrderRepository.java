package com.teste.demo.repository;

import com.teste.demo.entities.Order;
import com.teste.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {


}
