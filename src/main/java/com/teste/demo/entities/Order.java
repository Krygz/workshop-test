package com.teste.demo.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
<<<<<<< HEAD
import com.teste.demo.entities.enums.OrderStatus;
=======
>>>>>>> 00cd70410f3cc97a1dfbb1a1453d0928b8e0cccc
import jakarta.persistence.*;


import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
    private Instant moment;

<<<<<<< HEAD
    private Integer orderStatus;

=======
>>>>>>> 00cd70410f3cc97a1dfbb1a1453d0928b8e0cccc
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {
    }

<<<<<<< HEAD
    public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
=======
    public Order(Long id, Instant moment, User client) {
        this.id = id;
        this.moment = moment;
>>>>>>> 00cd70410f3cc97a1dfbb1a1453d0928b8e0cccc
        this.client = client;
    }

    public Order(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }
<<<<<<< HEAD

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if(orderStatus!= null) {
            this.orderStatus = orderStatus.getCode();
        }
    }

=======
>>>>>>> 00cd70410f3cc97a1dfbb1a1453d0928b8e0cccc
    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
