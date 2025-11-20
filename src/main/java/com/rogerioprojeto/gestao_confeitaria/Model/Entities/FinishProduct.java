package com.rogerioprojeto.gestao_confeitaria.Model.Entities;

import com.rogerioprojeto.gestao_confeitaria.Model.Enums.UnitType;
import jakarta.persistence.*;

@Entity
@Table(name = "Produto_Final")

public class FinishProduct{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;

    private String flavor;
    private String massType;
    private Integer units;
    private Double weight;

    @Enumerated(EnumType.STRING)
    private UnitType unitType;

    private Double price;
    private String customization;



    public FinishProduct(){
    }

    public FinishProduct(Long id, Product product, String flavor, String massType, Integer units, Double weight, UnitType unitType, Double price, String customization) {
        this.id = id;
        this.product = product;
        this.flavor = flavor;
        this.massType = massType;
        this.units = units;
        this.weight = weight;
        this.unitType = unitType;
        this.price = price;
        this.customization = customization;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getMassType() {
        return massType;
    }

    public void setMassType(String massType) {
        this.massType = massType;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCustomization() {
        return customization;
    }

    public void setCustomization(String customization) {
        this.customization = customization;
    }
}


