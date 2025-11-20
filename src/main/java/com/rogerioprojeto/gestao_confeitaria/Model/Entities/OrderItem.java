package com.rogerioprojeto.gestao_confeitaria.Model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Item_Pedido")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // relação com o produto final
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "finish_product_id")
    private FinishProduct finishProduct;

    private Integer quantity;

    //  Customização do cliente

    private String theme;            // tema do doce: Naruto, Homem-Aranha, Princesas...
    private String decorationNotes;  // observações de decoração
    private String colorPalette;     // “vermelho, azul e preto”

    private Double itemPrice;


    public OrderItem(){
    }

    public OrderItem(Long id, FinishProduct finishProduct, Integer quantity, String theme, String decorationNotes, String colorPalette, Double itemPrice) {
        this.id = id;
        this.finishProduct = finishProduct;
        this.quantity = quantity;
        this.theme = theme;
        this.decorationNotes = decorationNotes;
        this.colorPalette = colorPalette;
        this.itemPrice = itemPrice;
    }

    public Double getSubtotal() {
        if (itemPrice == null || quantity == null) {
            return 0.0;
        }
        return itemPrice * quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FinishProduct getFinishProduct() {
        return finishProduct;
    }

    public void setFinishProduct(FinishProduct finishProduct) {
        this.finishProduct = finishProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getDecorationNotes() {
        return decorationNotes;
    }

    public void setDecorationNotes(String decorationNotes) {
        this.decorationNotes = decorationNotes;
    }

    public String getColorPalette() {
        return colorPalette;
    }

    public void setColorPalette(String colorPalette) {
        this.colorPalette = colorPalette;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
