package com.dproject.market.domain;

public class ProductDomain {
    private Integer idProduct;
    private String name;
    private Integer idCategory;
    private String price;
    private Integer stock;
    private boolean active;
    private CategoryDomain categoryDomain;

    public CategoryDomain getCategoryDomain() {
        return categoryDomain;
    }

    public void setCategoryDomain(CategoryDomain categoryDomain) {
        this.categoryDomain = categoryDomain;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
