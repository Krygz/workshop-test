package com.teste.demo.service;

import com.teste.demo.entities.Order;
import com.teste.demo.entities.User;
import com.teste.demo.repository.OrderRepository;
import com.teste.demo.repository.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
      return orderRepository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> obj =  orderRepository.findById(id);
       return obj.get();
    }



}
