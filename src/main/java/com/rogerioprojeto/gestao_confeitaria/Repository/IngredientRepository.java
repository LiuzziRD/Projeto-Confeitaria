package com.rogerioprojeto.gestao_confeitaria.Repository;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
