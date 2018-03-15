package com.lllllw.hotel.model;

import java.util.Date;

public class Room {
    private Integer rId;

    private String rNumber;

    private Integer rType;

    private Integer rMember;

    private Integer rOrder;

    private Double rPrice;

    private Date rCreated;

    private Date rUpdated;

    private Integer rIntfield1;

    private Integer rIntfield2;

    private String rStringfield1;

    private String rStringfield2;

    private Date rDatefield1;

    private Date rDatefield2;

    private Date rDatetimefield1;

    private Date rDatetimefield2;

    private Boolean rBoolfield1;

    private Boolean rBoolfield2;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrNumber() {
        return rNumber;
    }

    public void setrNumber(String rNumber) {
        this.rNumber = rNumber == null ? null : rNumber.trim();
    }

    public Integer getrType() {
        return rType;
    }

    public void setrType(Integer rType) {
        this.rType = rType;
    }

    public Integer getrMember() {
        return rMember;
    }

    public void setrMember(Integer rMember) {
        this.rMember = rMember;
    }

    public Integer getrOrder() {
        return rOrder;
    }

    public void setrOrder(Integer rOrder) {
        this.rOrder = rOrder;
    }

    public Double getrPrice() {
        return rPrice;
    }

    public void setrPrice(Double rPrice) {
        this.rPrice = rPrice;
    }

    public Date getrCreated() {
        return rCreated;
    }

    public void setrCreated(Date rCreated) {
        this.rCreated = rCreated;
    }

    public Date getrUpdated() {
        return rUpdated;
    }

    public void setrUpdated(Date rUpdated) {
        this.rUpdated = rUpdated;
    }

    public Integer getrIntfield1() {
        return rIntfield1;
    }

    public void setrIntfield1(Integer rIntfield1) {
        this.rIntfield1 = rIntfield1;
    }

    public Integer getrIntfield2() {
        return rIntfield2;
    }

    public void setrIntfield2(Integer rIntfield2) {
        this.rIntfield2 = rIntfield2;
    }

    public String getrStringfield1() {
        return rStringfield1;
    }

    public void setrStringfield1(String rStringfield1) {
        this.rStringfield1 = rStringfield1 == null ? null : rStringfield1.trim();
    }

    public String getrStringfield2() {
        return rStringfield2;
    }

    public void setrStringfield2(String rStringfield2) {
        this.rStringfield2 = rStringfield2 == null ? null : rStringfield2.trim();
    }

    public Date getrDatefield1() {
        return rDatefield1;
    }

    public void setrDatefield1(Date rDatefield1) {
        this.rDatefield1 = rDatefield1;
    }

    public Date getrDatefield2() {
        return rDatefield2;
    }

    public void setrDatefield2(Date rDatefield2) {
        this.rDatefield2 = rDatefield2;
    }

    public Date getrDatetimefield1() {
        return rDatetimefield1;
    }

    public void setrDatetimefield1(Date rDatetimefield1) {
        this.rDatetimefield1 = rDatetimefield1;
    }

    public Date getrDatetimefield2() {
        return rDatetimefield2;
    }

    public void setrDatetimefield2(Date rDatetimefield2) {
        this.rDatetimefield2 = rDatetimefield2;
    }

    public Boolean getrBoolfield1() {
        return rBoolfield1;
    }

    public void setrBoolfield1(Boolean rBoolfield1) {
        this.rBoolfield1 = rBoolfield1;
    }

    public Boolean getrBoolfield2() {
        return rBoolfield2;
    }

    public void setrBoolfield2(Boolean rBoolfield2) {
        this.rBoolfield2 = rBoolfield2;
    }
}