package com.teste.demo;


import com.teste.demo.domain.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(null,"Carlos da silva" , "Carlos@gmail.com", LocalDate.now());
        Person p2 = new Person(null,"João da silva" , "Joãos@gmail.com",LocalDate.now());
        Person p3 = new Person(null,"Pedro da silva" , "Pedro@gmail.com",LocalDate.now());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();

        List<Person> list = em.createQuery("SELECT u FROM Person u", Person.class)
                .getResultList();

        list.forEach(System.out::println);


        em.getTransaction().commit();

        System.out.println("Pronto");
    }
}
