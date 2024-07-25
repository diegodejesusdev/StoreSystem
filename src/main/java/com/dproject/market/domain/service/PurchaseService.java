package com.dproject.market.domain.service;

import com.dproject.market.domain.PurchaseDomain;
import com.dproject.market.domain.repository.IPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private IPurchaseRepository purchaseRepository;

    public List<PurchaseDomain> findAll(){
        return purchaseRepository.findAll();
    }

    public Optional<List<PurchaseDomain>> findByClientId(int ClientId){
        return purchaseRepository.findByClientId(ClientId);
    }

    public PurchaseDomain savePurchase(PurchaseDomain purchase){
        return purchaseRepository.add(purchase);
    }
}
