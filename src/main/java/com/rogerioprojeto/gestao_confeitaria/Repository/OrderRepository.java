package com.rogerioprojeto.gestao_confeitaria.Repository;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
