package com.teste.demo.config;

import com.teste.demo.entities.User;
import com.teste.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
@Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null,"Jhon Wick","jhon@gmail.com","929848","dogslover");
        User u2 = new User(null,"Bruce Waine","batman@gmail.com","677654","batlover");

        userRepository.saveAll(Arrays.asList(u1,u2));


    }
}
