package org.springtest.beans;

public class Address {
    private String houseNo;
    private String locality;
    private String city;

    public Address() {
    }

    public Address(String houseNo, String locality, String city) {
        this.houseNo = houseNo;
        this.locality = locality;
        this.city = city;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
}
