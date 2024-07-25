package com.dproject.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class SalePK implements Serializable{
    @Column(name = "\"idPurchaseSale\"")
    private Integer IdPurchase;
    @Column(name = "\"idProductSale\"")
    private Integer IdProductSale;

    public Integer getIdProductSale() {
        return IdProductSale;
    }

    public void setIdProductSale(Integer idProductSale) {
        IdProductSale = idProductSale;
    }

    public Integer getIdPurchaseSale() {
        return IdPurchase;
    }

    public void setIdPurchaseSale(Integer idPurchase) {
        IdPurchase = idPurchase;
    }
}
