package com.dproject.market.persistence.crud;

import com.dproject.market.persistence.entity.PurchaseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PurchaseCrudRepository extends CrudRepository<PurchaseEntity, Integer>{
    Optional<List<PurchaseEntity>> findByIdClientPurchase(Integer idClientPurchase);
}
