package com.dproject.market.web.controller;

import com.dproject.market.domain.PurchaseDomain;
import com.dproject.market.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<PurchaseDomain>> findAll(){
        return new ResponseEntity<>(purchaseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<List<PurchaseDomain>> findByIdClient(@PathVariable("id") int id){
        return purchaseService.findByClientId(id)
                .map(purchaseDomains -> new ResponseEntity<>(purchaseDomains, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<PurchaseDomain> save(@RequestBody PurchaseDomain purchaseDomain){
        return new ResponseEntity<>(purchaseService.savePurchase(purchaseDomain), HttpStatus.CREATED);
    }
}
