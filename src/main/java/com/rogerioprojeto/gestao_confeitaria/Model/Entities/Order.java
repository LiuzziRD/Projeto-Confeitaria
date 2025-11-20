package com.rogerioprojeto.gestao_confeitaria.Model.Entities;


import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pedido")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime orderDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderItem> items = new ArrayList<>();

    private Double totalPrice = 0.0;

    public Order() {
    }

    public Order(Integer id, LocalDateTime orderDate, List<OrderItem> items, Double totalPrice) {
        this.id = id;
        this.orderDate = orderDate;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    // -------- MÉTODOS QUE FALTAVAM --------

    public void addItem(OrderItem item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        if (items != null) {
            items.remove(item);
        }
    }

    public void calculateTotal() {
        if (items == null || items.isEmpty()) {
            this.totalPrice = 0.0;
            return;
        }

        this.totalPrice = items.stream()
                .mapToDouble(OrderItem::getSubtotal)
                .sum();
    }

    // -------- GETTERS e SETTERS --------

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}