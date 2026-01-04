package com.springTest.SpringCompositeKey.models;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CompanyProdId implements Serializable {
    private String compName;
    private String prodName;

    public CompanyProdId() {
    }

    public CompanyProdId(String prodName, String compName) {
        this.prodName = prodName;
        this.compName = compName;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "CompanyProdId{" +
                "compName='" + compName + '\'' +
                ", prodName='" + prodName + '\'' +
                '}';
    }
}
