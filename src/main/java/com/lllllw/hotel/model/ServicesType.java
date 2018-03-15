package com.lllllw.hotel.model;

import java.util.Date;

public class ServicesType {
    private Integer stId;

    private String stName;

    private String stDesc;

    private Double stPrice;

    private Date stCreated;

    private Date stUpdated;

    private Integer stIntfield1;

    private Integer stIntfield2;

    private String stStringfield1;

    private String stStringfield2;

    private Date stDatetimefield1;

    private Date stDatetimefield2;

    private Date stDatefield1;

    private Date stDatefield2;

    private Boolean stBooleanfield1;

    private Boolean stBooleanfield2;

    public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStDesc() {
        return stDesc;
    }

    public void setStDesc(String stDesc) {
        this.stDesc = stDesc == null ? null : stDesc.trim();
    }

    public Double getStPrice() {
        return stPrice;
    }

    public void setStPrice(Double stPrice) {
        this.stPrice = stPrice;
    }

    public Date getStCreated() {
        return stCreated;
    }

    public void setStCreated(Date stCreated) {
        this.stCreated = stCreated;
    }

    public Date getStUpdated() {
        return stUpdated;
    }

    public void setStUpdated(Date stUpdated) {
        this.stUpdated = stUpdated;
    }

    public Integer getStIntfield1() {
        return stIntfield1;
    }

    public void setStIntfield1(Integer stIntfield1) {
        this.stIntfield1 = stIntfield1;
    }

    public Integer getStIntfield2() {
        return stIntfield2;
    }

    public void setStIntfield2(Integer stIntfield2) {
        this.stIntfield2 = stIntfield2;
    }

    public String getStStringfield1() {
        return stStringfield1;
    }

    public void setStStringfield1(String stStringfield1) {
        this.stStringfield1 = stStringfield1 == null ? null : stStringfield1.trim();
    }

    public String getStStringfield2() {
        return stStringfield2;
    }

    public void setStStringfield2(String stStringfield2) {
        this.stStringfield2 = stStringfield2 == null ? null : stStringfield2.trim();
    }

    public Date getStDatetimefield1() {
        return stDatetimefield1;
    }

    public void setStDatetimefield1(Date stDatetimefield1) {
        this.stDatetimefield1 = stDatetimefield1;
    }

    public Date getStDatetimefield2() {
        return stDatetimefield2;
    }

    public void setStDatetimefield2(Date stDatetimefield2) {
        this.stDatetimefield2 = stDatetimefield2;
    }

    public Date getStDatefield1() {
        return stDatefield1;
    }

    public void setStDatefield1(Date stDatefield1) {
        this.stDatefield1 = stDatefield1;
    }

    public Date getStDatefield2() {
        return stDatefield2;
    }

    public void setStDatefield2(Date stDatefield2) {
        this.stDatefield2 = stDatefield2;
    }

    public Boolean getStBooleanfield1() {
        return stBooleanfield1;
    }

    public void setStBooleanfield1(Boolean stBooleanfield1) {
        this.stBooleanfield1 = stBooleanfield1;
    }

    public Boolean getStBooleanfield2() {
        return stBooleanfield2;
    }

    public void setStBooleanfield2(Boolean stBooleanfield2) {
        this.stBooleanfield2 = stBooleanfield2;
    }
}