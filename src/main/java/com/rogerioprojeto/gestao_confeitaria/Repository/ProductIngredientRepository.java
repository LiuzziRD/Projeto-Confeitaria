package com.rogerioprojeto.gestao_confeitaria.Repository;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.ProductIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductIngredientRepository  extends JpaRepository<ProductIngredient, Long> {
}
