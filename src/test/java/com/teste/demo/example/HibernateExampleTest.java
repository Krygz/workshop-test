package com.teste.demo.example;

import com.sun.istack.NotNull;
import com.teste.demo.domain.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class HibernateExampleTest {


    private EntityManagerFactory emf;

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    @AfterEach
protected void setUp(){

    final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure()
            .build();

    try{
        emf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    }
    catch (Exception e){
        StandardServiceRegistryBuilder.destroy(registry);
    }


}


@AfterEach
    protected void tearDown(){
        if( emf != null){
            emf.close();
        }
    }

@Test

void save_my_first_user_in_db() throws EntityNotFoundException {



     EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

       List<Person> users = em.createQuery("select p from Person p", Person.class)
               .getResultList();

       users.forEach(System.out::println);

       em.getTransaction().commit();

       em.close();
    }
}



