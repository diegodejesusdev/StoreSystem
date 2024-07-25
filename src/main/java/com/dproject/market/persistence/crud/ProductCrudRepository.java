package com.dproject.market.persistence.crud;

import com.dproject.market.persistence.entity.*;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
    List<ProductEntity> findByIdCategoryProductOrderByNameProductAsc(int idCategoryProduct);
    Optional<List<ProductEntity>> findByStockProductLessThanAndStatusProduct(int stockProduct, boolean statusProduct);
}
