package com.dproject.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"idProduct\"")
    private Integer idProduct;
    @Column(name = "\"nameProduct\"")
    private String nameProduct;
    @Column(name = "\"idCategoryProduct\"")
    private Integer idCategoryProduct;
    @Column(name = "\"barcodeProduct\"")
    private String barcodeProduct;
    @Column(name = "\"salePriceProduct\"")
    private double salePriceProduct;
    @Column(name = "\"stockProduct\"")
    private Integer stockProduct;
    @Column(name = "\"statusProduct\"")
    private boolean statusProduct;
    @ManyToOne
    @JoinColumn(name = "\"idCategoryProduct\"", insertable = false, updatable = false)
    private CategoryEntity categoryEntity;

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public String getBarcodeProduct() {
        return barcodeProduct;
    }

    public void setBarcodeProduct(String barcodeProduct) {
        this.barcodeProduct = barcodeProduct;
    }

    public Integer getIdCategoryProduct() {
        return idCategoryProduct;
    }

    public void setIdCategoryProduct(Integer idCategoryProduct) {
        this.idCategoryProduct = idCategoryProduct;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getSalePriceProduct() {
        return salePriceProduct;
    }

    public void setSalePriceProduct(double salePriceProduct) {
        this.salePriceProduct = salePriceProduct;
    }

    public boolean isStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(boolean statusProduct) {
        this.statusProduct = statusProduct;
    }

    public Integer getStockProduct() {
        return stockProduct;
    }

    public void setStockProduct(Integer stockProduct) {
        this.stockProduct = stockProduct;
    }
}
