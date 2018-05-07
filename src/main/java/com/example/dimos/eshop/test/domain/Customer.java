package com.example.dimos.eshop.test.domain;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.standard.DateTimeContext;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "helios_id")
    private Integer heliosId;

    @Column(name = "company")
    private String company;

    @Column(name = "contact")
    private String contact;

    @Column(name = "headquaters")
    private String headquaters;

    @Column(name = "city")
    private String city;

    @Column(name = "zip")
    private String zip;

    @Column(name = "business_id")
    private String businessId;

    @Column(name = "tax_id")
    private String taxId;

    @Column(name = "vat_id")
    private String vatId;

    @Column(name = "IBAN")
    private String IBAN;

    @Column(name = "mobil")
    private String mobil;

    @Column(name = "discount")
    private Float discount;

    @Column(name = "token")
    private String token;

    @Column(name = "token_valid_till")
    private String tokenValidTill;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "customer")
    private Set<AdditionalAddress> additionalAddresses;

    @OneToMany(mappedBy = "customer")
    private Set<Order> orders;

    public Customer() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getHeliosId() {
        return heliosId;
    }

    public void setHeliosId(Integer heliosId) {
        this.heliosId = heliosId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getHeadquaters() {
        return headquaters;
    }

    public void setHeadquaters(String headquarters) {
        this.headquaters = headquaters;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getVatId() {
        return vatId;
    }

    public void setVatId(String vatId) {
        this.vatId = vatId;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTokenValidTill() {
        return tokenValidTill;
    }

    public void setTokenValidTill(String tokenValidTill) {
        this.tokenValidTill = tokenValidTill;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Set<AdditionalAddress> getAdditionalAddresses() {
        return additionalAddresses;
    }

    public void setAdditionalAddresses(Set<AdditionalAddress> additionalAddresses) {
        this.additionalAddresses = additionalAddresses;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
