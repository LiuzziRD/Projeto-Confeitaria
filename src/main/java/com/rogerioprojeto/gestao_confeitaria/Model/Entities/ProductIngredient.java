package com.rogerioprojeto.gestao_confeitaria.Model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "produto_ingrediente")
public class ProductIngredient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Produto (bolo, torta, etc)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_produto")
    private Product product;

    // Ingrediente (açúcar, ovo, etc)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_ingrediente")
    private Ingredient ingredient;

    // Quanto desse ingrediente é usado no produto
    private Double quantidadeUsada;

    public ProductIngredient() {}

    public ProductIngredient(Long id, Product product, Ingredient ingredient, Double quantidadeUsada) {
        this.id = id;
        this.product = product;
        this.ingredient = ingredient;
        this.quantidadeUsada = quantidadeUsada;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public Ingredient getIngredient() { return ingredient; }
    public void setIngredient(Ingredient ingredient) { this.ingredient = ingredient; }

    public Double getQuantidadeUsada() { return quantidadeUsada; }
    public void setQuantidadeUsada(Double quantidadeUsada) { this.quantidadeUsada = quantidadeUsada; }
}
