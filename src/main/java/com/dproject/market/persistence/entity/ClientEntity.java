package com.dproject.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clients")
public class ClientEntity {
    @Id
    @Column(name = "\"idClient\"")
    private Integer idClient;
    @Column(name = "\"firstnameClient\"")
    private String firstnameClient;
    @Column(name = "\"lastnameClient\"")
    private String lastnameClient;
    @Column(name = "\"phoneClient\"")
    private String phoneClient;
    @Column(name = "\"addressClient\"")
    private String addressClient;
    @Column(name = "\"emailClient\"")
    private String emailClient;
    @OneToMany(mappedBy = "clientEntity")
    private List<PurchaseEntity> purchaseEntities;

    public String getAddressClient() {
        return addressClient;
    }

    public void setAddressClient(String addressClient) {
        this.addressClient = addressClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getFirstnameClient() {
        return firstnameClient;
    }

    public void setFirstnameClient(String firstnameClient) {
        this.firstnameClient = firstnameClient;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getLastnameClient() {
        return lastnameClient;
    }

    public void setLastnameClient(String lastnameClient) {
        this.lastnameClient = lastnameClient;
    }

    public String getPhoneClient() {
        return phoneClient;
    }

    public void setPhoneClient(String phoneClient) {
        this.phoneClient = phoneClient;
    }
}
