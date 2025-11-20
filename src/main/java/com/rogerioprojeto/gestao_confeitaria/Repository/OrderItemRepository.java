package com.rogerioprojeto.gestao_confeitaria.Repository;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
