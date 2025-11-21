package com.rogerioprojeto.gestao_confeitaria.Service;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.Ingredient;
import com.rogerioprojeto.gestao_confeitaria.Repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    private final IngredientRepository repository;

    public IngredientService(IngredientRepository repository) {
        this.repository = repository;
    }

    public Ingredient create(Ingredient ingredient) {
        return repository.save(ingredient);
    }

    public List<Ingredient> findAll() {
        return repository.findAll();
    }

    public Optional<Ingredient> findById(Long id) {
        return repository.findById(id);
    }

    public Ingredient update(Ingredient ingredient) {
        return repository.save(ingredient);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}