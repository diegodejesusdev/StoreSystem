package com.dproject.market.persistence;

import com.dproject.market.domain.ProductDomain;
import com.dproject.market.domain.repository.IProductRepository;
import com.dproject.market.persistence.crud.ProductCrudRepository;
import com.dproject.market.persistence.entity.ProductEntity;
import com.dproject.market.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository implements IProductRepository {
    @Autowired
    private ProductMapper mapper;
    @Autowired
    private ProductCrudRepository productCrudRepository;

    @Override
    public List<ProductDomain> findAll() {
        return mapper.toProductsDomain((List<ProductEntity>) productCrudRepository.findAll());
    }

    @Override
    public Optional<List<ProductDomain>> findByCategory(int idCategoryProduct) {
        return Optional.of(mapper.toProductsDomain(productCrudRepository.findByIdCategoryProductOrderByNameProductAsc(idCategoryProduct)));
    }

    @Override
    public Optional<List<ProductDomain>> findLessThan(int quantity) {
        Optional<List<ProductEntity>> products = productCrudRepository.findByStockProductLessThanAndStatusProduct(quantity, true);
        return products.map(mapper::toProductsDomain);
    }

    @Override
    public ProductDomain saveProduct(ProductDomain product) {
        ProductEntity productEntity = mapper.toProductEntity(product);
        return mapper.toProductDomain(productCrudRepository.save(productEntity));
    }

    @Override
    public Optional<ProductDomain> findById(int idProduct) {
        return productCrudRepository.findById(idProduct).map(mapper::toProductDomain);
    }

    @Override
    public void deleteProduct(int idProduct) {
        productCrudRepository.deleteById(idProduct);
    }
}
