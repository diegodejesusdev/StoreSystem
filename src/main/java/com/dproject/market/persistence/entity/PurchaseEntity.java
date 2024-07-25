package com.dproject.market.persistence.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "purchases")
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"idPurchase\"")
    private Integer idPurchase;
    @Column(name = "\"idClientPurchase\"")
    private Integer idClientPurchase;
    @Column(name = "\"datePurchase\"")
    private LocalDateTime datePurchase;
    @Column(name = "\"paymentMethodPurchase\"")
    private String paymentMethodPurchase;
    @Column(name = "\"commentPurchase\"")
    private String commentPurchase;
    @Column(name = "\"statusPurchase\"")
    private String statusPurchase;
    @ManyToOne
    @JoinColumn(name = "\"idClientPurchase\"", insertable = false, updatable = false)
    private ClientEntity clientEntity;
    @OneToMany(mappedBy = "purchaseEntity", cascade = {CascadeType.ALL})
    private List<SaleEntity> product;

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public List<SaleEntity> getProduct() {
        return product;
    }

    public void setProduct(List<SaleEntity> product) {
        this.product = product;
    }

    public String getCommentPurchase() {
        return commentPurchase;
    }

    public void setCommentPurchase(String commentPurchase) {
        this.commentPurchase = commentPurchase;
    }

    public LocalDateTime getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(LocalDateTime datePurchase) {
        this.datePurchase = datePurchase;
    }

    public Integer getIdClientPurchase() {
        return idClientPurchase;
    }

    public void setIdClientPurchase(Integer idClientPurchase) {
        this.idClientPurchase = idClientPurchase;
    }

    public Integer getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(Integer idPurchase) {
        this.idPurchase = idPurchase;
    }

    public String getPaymentMethodPurchase() {
        return paymentMethodPurchase;
    }

    public void setPaymentMethodPurchase(String paymentMethodPurchase) {
        this.paymentMethodPurchase = paymentMethodPurchase;
    }

    public String getStatusPurchase() {
        return statusPurchase;
    }

    public void setStatusPurchase(String statusPurchase) {
        this.statusPurchase = statusPurchase;
    }

}
