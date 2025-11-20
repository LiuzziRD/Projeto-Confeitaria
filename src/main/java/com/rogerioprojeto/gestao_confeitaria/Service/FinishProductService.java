package com.rogerioprojeto.gestao_confeitaria.Service;

import com.rogerioprojeto.gestao_confeitaria.Model.Entities.FinishProduct;
import com.rogerioprojeto.gestao_confeitaria.Repository.FinishProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinishProductService {

    private final FinishProductRepository finishProductRepository;

    public FinishProductService(FinishProductRepository finishProductRepository) {
        this.finishProductRepository = finishProductRepository;
    }

    public FinishProduct create(FinishProduct fp) {
        return finishProductRepository.save(fp);
    }

    public List<FinishProduct> findAll() {
        return finishProductRepository.findAll();
    }

    public Optional<FinishProduct> findById(Long id) {
        return finishProductRepository.findById(id);
    }

    public void delete(Long id) {
        finishProductRepository.deleteById(id);
    }
}
