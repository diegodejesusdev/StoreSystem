package com.dproject.market.persistence;

import com.dproject.market.MarketApplication;
import com.dproject.market.domain.PurchaseDomain;
import com.dproject.market.domain.repository.IPurchaseRepository;
import com.dproject.market.persistence.crud.PurchaseCrudRepository;
import com.dproject.market.persistence.entity.PurchaseEntity;
import com.dproject.market.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PurchaseRepository implements IPurchaseRepository {

    @Autowired
    private PurchaseCrudRepository purchaseCrudRepository;
    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    public List<PurchaseDomain> findAll() {
        return purchaseMapper.toPurchaseDomainList((List<PurchaseEntity>) purchaseCrudRepository.findAll());
    }

    @Override
    public Optional<List<PurchaseDomain>> findByClientId(int idClient) {
        return purchaseCrudRepository.findByIdClientPurchase(idClient).map(purchaseMapper::toPurchaseDomainList);
    }

    @Override
    public PurchaseDomain add(PurchaseDomain purchaseDomain) {
        PurchaseEntity purchaseEntity = purchaseMapper.toPurchaseEntity(purchaseDomain);
        purchaseEntity.getProduct().forEach(product -> product.setPurchaseEntity(purchaseEntity));
        return purchaseMapper.toPurchaseDomain(purchaseCrudRepository.save(purchaseEntity));
    }
}
