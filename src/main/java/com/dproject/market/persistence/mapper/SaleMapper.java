package com.dproject.market.persistence.mapper;

import com.dproject.market.domain.SaleDomain;
import com.dproject.market.persistence.entity.SaleEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface SaleMapper {
    @Mappings({
            @Mapping(source = "idSale.idPurchaseSale", target = "idProduct"),
            @Mapping(source = "quantitySale", target = "quantity"),
            @Mapping(source = "totalSale", target = "price"),
            @Mapping(source = "statusSale", target = "active")
    })
    SaleDomain toSaleDomain(SaleEntity saleEntity);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "purchaseEntity", ignore = true),
            @Mapping(target = "productEntity", ignore = true),
            @Mapping(target = "idSale.idProductSale", ignore = true)
    })
    SaleEntity toSaleEntity(SaleDomain saleDomain);
}
