package com.rogerioprojeto.gestao_confeitaria.Repository;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
