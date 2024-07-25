package com.dproject.market.domain.service;

import com.dproject.market.domain.ProductDomain;
import com.dproject.market.domain.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;

    public List<ProductDomain> findAll(){
        return productRepository.findAll();
    }
    public Optional<ProductDomain> findProduct(int id){
        return productRepository.findById(id);
    }
    public Optional<List<ProductDomain>> findByCategory(int idCategory){
        return productRepository.findByCategory(idCategory);
    }
    public ProductDomain saveProduct(ProductDomain product){
        return productRepository.saveProduct(product);
    }
    public boolean deleteProduct(int idProduct){
        if (findProduct(idProduct).isPresent()){
            productRepository.deleteProduct(idProduct);
            return true;
        }
        return false;
    }
}
