package com.dproject.market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDomain {
    private int idPurchase;
    private Integer idClientPurchase;
    private LocalDateTime datePurchase;
    private String paymentMethodPurchase;
    private String commentPurchase;
    private String statusPurchase;
    private List<SaleDomain> items;

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

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public List<SaleDomain> getItems() {
        return items;
    }

    public void setItems(List<SaleDomain> items) {
        this.items = items;
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
