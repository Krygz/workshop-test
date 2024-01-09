package com.teste.demo.config;

import com.teste.demo.entities.Order;
import com.teste.demo.entities.User;
import com.teste.demo.repository.OrderRepository;
import com.teste.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
@Autowired
    private UserRepository userRepository;
@Autowired
   private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null,"Jhon Wick","jhon@gmail.com","929848","dogslover");
        User u2 = new User(null,"Bruce Waine","batman@gmail.com","677654","batlover");


        Order o1 = new Order(null, Instant.parse("2019-07-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2019-02-20T19:33:05Z") , u2);
        Order o3 = new Order(null, Instant.parse("2019-05-20T19:45:09Z") , u1);

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));


    }
}
