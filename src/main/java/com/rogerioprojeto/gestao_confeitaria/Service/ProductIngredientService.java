package com.rogerioprojeto.gestao_confeitaria.Service;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.ProductIngredient;
import com.rogerioprojeto.gestao_confeitaria.Repository.ProductIngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductIngredientService {

    private final ProductIngredientRepository repository;

    public ProductIngredientService(ProductIngredientRepository repository) {
        this.repository = repository;
    }

    public ProductIngredient create(ProductIngredient pi) {
        return repository.save(pi);
    }

    public List<ProductIngredient> findAll() {
        return repository.findAll();
    }

    public Optional<ProductIngredient> findById(Long id) {
        return repository.findById(id);
    }

    public ProductIngredient update(ProductIngredient pi) {
        return repository.save(pi);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

