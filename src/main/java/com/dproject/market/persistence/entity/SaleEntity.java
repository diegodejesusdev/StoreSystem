package com.dproject.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sales")
public class SaleEntity {
    @EmbeddedId
    private SalePK idSale;
    @Column(name = "\"quantitySale\"")
    private Integer quantitySale;
    @Column(name = "\"totalSale\"")
    private double totalSale;
    @Column(name = "\"statusSale\"")
    private boolean statusSale;

    @ManyToOne
    @MapsId("IdPurchase")
    @JoinColumn(name = "\"idPurchaseSale\"", insertable = false, updatable = false)
    private PurchaseEntity purchaseEntity;

    @ManyToOne
    @JoinColumn(name = "\"idProductSale\"", insertable = false, updatable = false)
    private ProductEntity productEntity;

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public PurchaseEntity getPurchaseEntity() {
        return purchaseEntity;
    }

    public void setPurchaseEntity(PurchaseEntity purchaseEntity) {
        this.purchaseEntity = purchaseEntity;
    }

    public SalePK getIdSale() {
        return idSale;
    }

    public void setIdSale(SalePK idSale) {
        this.idSale = idSale;
    }

    public Integer getQuantitySale() {
        return quantitySale;
    }

    public void setQuantitySale(Integer quantitySale) {
        this.quantitySale = quantitySale;
    }

    public boolean isStatusSale() {
        return statusSale;
    }

    public void setStatusSale(boolean statusSale) {
        this.statusSale = statusSale;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }
}
