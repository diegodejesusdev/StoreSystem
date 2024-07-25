package com.dproject.market.domain.repository;

import com.dproject.market.domain.PurchaseDomain;

import java.util.List;
import java.util.Optional;

public interface IPurchaseRepository {
    List<PurchaseDomain> findAll();
    Optional<List<PurchaseDomain>> findByClientId(int idClient);
    PurchaseDomain add(PurchaseDomain purchaseDomain);
}
