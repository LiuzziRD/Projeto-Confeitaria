package com.rogerioprojeto.gestao_confeitaria.Model.Entities;


import jakarta.persistence.*;

@Entity
@Table(name = "ingrediente")
public class Ingredient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double quantidade;

    private String unidade; // g, kg, ml, L, unid

    public Ingredient() {}

    public Ingredient(Long id, String nome, Double quantidade, String unidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.unidade = unidade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Double getQuantidade() { return quantidade; }
    public void setQuantidade(Double quantidade) { this.quantidade = quantidade; }

    public String getUnidade() { return unidade; }
    public void setUnidade(String unidade) { this.unidade = unidade; }

}
