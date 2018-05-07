package com.example.dimos.eshop.test.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "active")
    private Integer active;

    @Column(name = "product_number")
    private Integer productNumber;

    @Column(name = "helios_id_prod")
    private Integer heliosIdProd;

    @Column(name = "helios_id_test")
    private Integer heliosIdTest;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "type")
    private String type;

    @Column(name = "header1")
    private String header1;

    @Column(name = "value1")
    private String value1;

    @Column(name = "header2")
    private String header2;

    @Column(name = "value2")
    private String value2;

    @Column(name = "header3")
    private String header3;

    @Column(name = "value3")
    private String value3;

    @Column(name = "header4")
    private String header4;

    @Column(name = "value4")
    private String value4;

    @Column(name = "header5")
    private String header5;

    @Column(name = "value5")
    private String value5;

    @Column(name = "header6")
    private String header6;

    @Column(name = "value6")
    private String value6;

    @Column(name = "header7")
    private String header7;

    @Column(name = "value7")
    private String value7;

    @Column(name = "header8")
    private String header8;

    @Column(name = "value8")
    private String value8;

    @Column(name = "pieces_per_pack")
    private String piecesPerPack;

    @Column(name = "pack_price")
    private String packPrice;

    @Column(name = "pdf")
    private String pdf;

    @Column(name = "img1")
    private String img1;

    @Column(name = "img2")
    private String img2;

    @Column(name = "img3")
    private String img3;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "product")
    private Set<FilterProduct> filterProducts;

    @OneToMany(mappedBy = "product")
    private Set<RelatedProduct> relatedProducts;

    @OneToMany(mappedBy = "product")
    private Set<CategoryProduct> categoryProducts;

    @OneToMany(mappedBy = "product")
    private Set<ProductMainIcon> productMainIcons;

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getHeliosIdProd() {
        return heliosIdProd;
    }

    public void setHeliosIdProd(Integer heliosIdProd) {
        this.heliosIdProd = heliosIdProd;
    }

    public Integer getHeliosIdTest() {
        return heliosIdTest;
    }

    public void setHeliosIdTest(Integer heliosIdTest) {
        this.heliosIdTest = heliosIdTest;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeader1() {
        return header1;
    }

    public void setHeader1(String header1) {
        this.header1 = header1;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getHeader2() {
        return header2;
    }

    public void setHeader2(String header2) {
        this.header2 = header2;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getHeader3() {
        return header3;
    }

    public void setHeader3(String header3) {
        this.header3 = header3;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getHeader4() {
        return header4;
    }

    public void setHeader4(String header4) {
        this.header4 = header4;
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public String getHeader5() {
        return header5;
    }

    public void setHeader5(String header5) {
        this.header5 = header5;
    }

    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public String getHeader6() {
        return header6;
    }

    public void setHeader6(String header6) {
        this.header6 = header6;
    }

    public String getValue6() {
        return value6;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }

    public String getHeader7() {
        return header7;
    }

    public void setHeader7(String header7) {
        this.header7 = header7;
    }

    public String getValue7() {
        return value7;
    }

    public void setValue7(String value7) {
        this.value7 = value7;
    }

    public String getHeader8() {
        return header8;
    }

    public void setHeader8(String header8) {
        this.header8 = header8;
    }

    public String getValue8() {
        return value8;
    }

    public void setValue8(String value8) {
        this.value8 = value8;
    }

    public String getPiecesPerPack() {
        return piecesPerPack;
    }

    public void setPiecesPerPack(String piecesPerPack) {
        this.piecesPerPack = piecesPerPack;
    }

    public String getPackPrice() {
        return packPrice;
    }

    public void setPackPrice(String packPrice) {
        this.packPrice = packPrice;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
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

    public Set<FilterProduct> getFilterProducts() {
        return filterProducts;
    }

    public void setFilterProducts(Set<FilterProduct> filterProducts) {
        this.filterProducts = filterProducts;
    }

    public Set<RelatedProduct> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(Set<RelatedProduct> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public Set<CategoryProduct> getCategoryProducts() {
        return categoryProducts;
    }

    public void setCategoryProducts(Set<CategoryProduct> categoryProducts) {
        this.categoryProducts = categoryProducts;
    }

    public Set<ProductMainIcon> getProductMainIcons() {
        return productMainIcons;
    }

    public void setProductMainIcons(Set<ProductMainIcon> productMainIcons) {
        this.productMainIcons = productMainIcons;
    }
}
