package com.dproject.market.domain.repository;

import com.dproject.market.domain.ProductDomain;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {
    List<ProductDomain> findAll();
    Optional<ProductDomain> findById(int id);
    Optional<List<ProductDomain>> findByCategory(int idCategory);
    Optional<List<ProductDomain>>findLessThan(int quantity);
    ProductDomain saveProduct(ProductDomain product);
    void deleteProduct(int idProduct);
}
