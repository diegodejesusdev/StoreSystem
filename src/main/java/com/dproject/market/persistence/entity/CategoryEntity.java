package com.dproject.market.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"idCategory\"")
    private Integer idCategory;
    @Column(name = "\"descriptionCategory\"")
    private String descriptionCategory;
    @Column(name = "\"statusCategory\"")
    private boolean statusCategory = true;
    @OneToMany(mappedBy = "categoryEntity")
    private List<ProductEntity> products;

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public String getDescriptionCategory() {
        return descriptionCategory;
    }

    public void setDescriptionCategory(String descriptionCategory) {
        this.descriptionCategory = descriptionCategory;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public boolean isStatusCategory() {
        return statusCategory;
    }

    public void setStatusCategory(boolean statusCategory) {
        this.statusCategory = statusCategory;
    }
}
