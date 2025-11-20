package com.rogerioprojeto.gestao_confeitaria.Service;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.Order;
import com.rogerioprojeto.gestao_confeitaria.Model.Entities.OrderItem;
import com.rogerioprojeto.gestao_confeitaria.Repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Criar pedido vazio
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    // Buscar pedido por ID
    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }

    // Adicionar item ao pedido
    public Order addItem(Long orderId, OrderItem item) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        order.addItem(item);     // adiciona o item à lista
        order.calculateTotal();  // recalcula o total

        return orderRepository.save(order);
    }

    // Remover item (opcional)
    public Order removeItem(Long orderId, OrderItem item) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        order.removeItem(item);
        order.calculateTotal();

        return orderRepository.save(order);
    }
}

