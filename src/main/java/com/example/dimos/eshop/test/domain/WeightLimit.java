package com.example.dimos.eshop.test.domain;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "weights_limit")
public class WeightLimit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "product_number")
    private Integer productNumber;

    @Column(name = "helios_id")
    private Integer heliosId;

    @Column(name = "from")
    private String from;

    @Column(name = "to")
    private String to;

    @Column(name = "set_price")
    private String setPrice;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getHeliosId() {
        return heliosId;
    }

    public void setHeliosId(Integer heliosId) {
        this.heliosId = heliosId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSetPrice() {
        return setPrice;
    }

    public void setSetPrice(String setPrice) {
        this.setPrice = setPrice;
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
}
