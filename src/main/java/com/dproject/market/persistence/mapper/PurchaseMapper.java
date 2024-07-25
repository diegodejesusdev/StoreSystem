package com.dproject.market.persistence.mapper;

import com.dproject.market.domain.PurchaseDomain;
import com.dproject.market.persistence.entity.PurchaseEntity;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses = {SaleMapper.class})
public interface PurchaseMapper {

    @Mapping(source = "idPurchase", target = "idPurchase")
    @Mapping(source = "idClientPurchase", target = "idClientPurchase")
    @Mapping(source = "datePurchase", target = "datePurchase")
    @Mapping(source = "paymentMethodPurchase", target = "paymentMethodPurchase")
    @Mapping(source = "commentPurchase", target = "commentPurchase")
    @Mapping(source = "statusPurchase", target = "statusPurchase")
    @Mapping(source = "product", target = "items")
    PurchaseDomain toPurchaseDomain(PurchaseEntity purchaseEntity);
    List<PurchaseDomain> toPurchaseDomainList(List<PurchaseEntity> purchaseEntityList);

    @InheritInverseConfiguration
    @Mapping(target = "clientEntity", ignore = true)
    PurchaseEntity toPurchaseEntity(PurchaseDomain purchaseDomain);
}
