package com.example.dimos.eshop.test.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "products_main_icons")
public class ProductMainIcon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "icon1")
    private String icon1;

    @Column(name = "icon2")
    private String icon2;

    @Column(name = "icon3")
    private String icon3;

    @Column(name = "icon4")
    private String icon4;

    @Column(name = "icon5")
    private String icon5;

    @Column(name = "icon6")
    private String icon6;

    @Column(name = "icon7")
    private String icon7;

    @Column(name = "icon8")
    private String icon8;

    @Column(name = "icon9")
    private String icon9;

    @Column(name = "icon10")
    private String icon10;

    @Column(name = "icon11")
    private String icon11;

    @Column(name = "icon12")
    private String icon12;

    @Column(name = "icon13")
    private String icon13;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public String getIcon1() {
        return icon1;
    }

    public void setIcon1(String icon1) {
        this.icon1 = icon1;
    }

    public String getIcon2() {
        return icon2;
    }

    public void setIcon2(String icon2) {
        this.icon2 = icon2;
    }

    public String getIcon3() {
        return icon3;
    }

    public void setIcon3(String icon3) {
        this.icon3 = icon3;
    }

    public String getIcon4() {
        return icon4;
    }

    public void setIcon4(String icon4) {
        this.icon4 = icon4;
    }

    public String getIcon5() {
        return icon5;
    }

    public void setIcon5(String icon5) {
        this.icon5 = icon5;
    }

    public String getIcon6() {
        return icon6;
    }

    public void setIcon6(String icon6) {
        this.icon6 = icon6;
    }

    public String getIcon7() {
        return icon7;
    }

    public void setIcon7(String icon7) {
        this.icon7 = icon7;
    }

    public String getIcon8() {
        return icon8;
    }

    public void setIcon8(String icon8) {
        this.icon8 = icon8;
    }

    public String getIcon9() {
        return icon9;
    }

    public void setIcon9(String icon9) {
        this.icon9 = icon9;
    }

    public String getIcon10() {
        return icon10;
    }

    public void setIcon10(String icon10) {
        this.icon10 = icon10;
    }

    public String getIcon11() {
        return icon11;
    }

    public void setIcon11(String icon11) {
        this.icon11 = icon11;
    }

    public String getIcon12() {
        return icon12;
    }

    public void setIcon12(String icon12) {
        this.icon12 = icon12;
    }

    public String getIcon13() {
        return icon13;
    }

    public void setIcon13(String icon13) {
        this.icon13 = icon13;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
