package com.springTest.SpringCompositeKey.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "Companies")
public class Company {

    @EmbeddedId
    private CompanyProdId companyProdId;
    private Double price;

    public Company(){}

    public Company(CompanyProdId companyProdId, Double price) {
        this.companyProdId = companyProdId;
        this.price = price;
    }

    public CompanyProdId getCompanyProdId() {
        return companyProdId;
    }

    public void setCompanyProdId(CompanyProdId companyProdId) {
        this.companyProdId = companyProdId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
