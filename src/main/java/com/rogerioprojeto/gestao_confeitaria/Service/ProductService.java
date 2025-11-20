package com.rogerioprojeto.gestao_confeitaria.Service;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.Product;
import com.rogerioprojeto.gestao_confeitaria.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Criar produto
    public Product create(Product product) {
        return productRepository.save(product);
    }

    // Listar todos
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // Buscar por ID
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    // Atualizar
    public Product update(Product product) {
        return productRepository.save(product);
    }

    // Deletar
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
