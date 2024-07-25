package com.dproject.market.persistence.mapper;

import com.dproject.market.domain.ProductDomain;
import com.dproject.market.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProduct",target = "idProduct"),
            @Mapping(source = "nameProduct",target = "name"),
            @Mapping(source = "idCategoryProduct",target = "idCategory"),
            @Mapping(source = "salePriceProduct",target = "price"),
            @Mapping(source = "stockProduct",target = "stock"),
            @Mapping(source = "statusProduct",target = "active"),
            @Mapping(source = "categoryEntity",target = "categoryDomain")
    })
    ProductDomain toProductDomain(ProductEntity productEntity);
    List<ProductDomain> toProductsDomain(List<ProductEntity> productEntity);

    @InheritInverseConfiguration
    @Mapping(target = "barcodeProduct", ignore = true)
    ProductEntity toProductEntity(ProductDomain productDomain);
}
