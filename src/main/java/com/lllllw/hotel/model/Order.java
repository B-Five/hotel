package com.lllllw.hotel.model;

import java.util.Date;

public class Order {
    private Integer oId;

    private Integer oUid;

    private Integer oRid;

    private Date oCheckintime;

    private Date oCheckouttime;

    private Double oDeposit;

    private Double oPrice;

    private Boolean oStatus;

    private Date oCreated;

    private Date oUpdated;

    private String oIntfield1;

    private String oIntfield2;

    private String oStringfield1;

    private String oStringfield2;

    private Date oDatefield1;

    private Date oDatefield2;

    private Date oDatetimefield1;

    private Date oDatetimefield2;

    private Boolean oBoolfield1;

    private Boolean oBoolfield2;

    public Integer getoId() {
        return oId;
    }

    public void setoId(Integer oId) {
        this.oId = oId;
    }

    public Integer getoUid() {
        return oUid;
    }

    public void setoUid(Integer oUid) {
        this.oUid = oUid;
    }

    public Integer getoRid() {
        return oRid;
    }

    public void setoRid(Integer oRid) {
        this.oRid = oRid;
    }

    public Date getoCheckintime() {
        return oCheckintime;
    }

    public void setoCheckintime(Date oCheckintime) {
        this.oCheckintime = oCheckintime;
    }

    public Date getoCheckouttime() {
        return oCheckouttime;
    }

    public void setoCheckouttime(Date oCheckouttime) {
        this.oCheckouttime = oCheckouttime;
    }

    public Double getoDeposit() {
        return oDeposit;
    }

    public void setoDeposit(Double oDeposit) {
        this.oDeposit = oDeposit;
    }

    public Double getoPrice() {
        return oPrice;
    }

    public void setoPrice(Double oPrice) {
        this.oPrice = oPrice;
    }

    public Boolean getoStatus() {
        return oStatus;
    }

    public void setoStatus(Boolean oStatus) {
        this.oStatus = oStatus;
    }

    public Date getoCreated() {
        return oCreated;
    }

    public void setoCreated(Date oCreated) {
        this.oCreated = oCreated;
    }

    public Date getoUpdated() {
        return oUpdated;
    }

    public void setoUpdated(Date oUpdated) {
        this.oUpdated = oUpdated;
    }

    public String getoIntfield1() {
        return oIntfield1;
    }

    public void setoIntfield1(String oIntfield1) {
        this.oIntfield1 = oIntfield1 == null ? null : oIntfield1.trim();
    }

    public String getoIntfield2() {
        return oIntfield2;
    }

    public void setoIntfield2(String oIntfield2) {
        this.oIntfield2 = oIntfield2 == null ? null : oIntfield2.trim();
    }

    public String getoStringfield1() {
        return oStringfield1;
    }

    public void setoStringfield1(String oStringfield1) {
        this.oStringfield1 = oStringfield1 == null ? null : oStringfield1.trim();
    }

    public String getoStringfield2() {
        return oStringfield2;
    }

    public void setoStringfield2(String oStringfield2) {
        this.oStringfield2 = oStringfield2 == null ? null : oStringfield2.trim();
    }

    public Date getoDatefield1() {
        return oDatefield1;
    }

    public void setoDatefield1(Date oDatefield1) {
        this.oDatefield1 = oDatefield1;
    }

    public Date getoDatefield2() {
        return oDatefield2;
    }

    public void setoDatefield2(Date oDatefield2) {
        this.oDatefield2 = oDatefield2;
    }

    public Date getoDatetimefield1() {
        return oDatetimefield1;
    }

    public void setoDatetimefield1(Date oDatetimefield1) {
        this.oDatetimefield1 = oDatetimefield1;
    }

    public Date getoDatetimefield2() {
        return oDatetimefield2;
    }

    public void setoDatetimefield2(Date oDatetimefield2) {
        this.oDatetimefield2 = oDatetimefield2;
    }

    public Boolean getoBoolfield1() {
        return oBoolfield1;
    }

    public void setoBoolfield1(Boolean oBoolfield1) {
        this.oBoolfield1 = oBoolfield1;
    }

    public Boolean getoBoolfield2() {
        return oBoolfield2;
    }

    public void setoBoolfield2(Boolean oBoolfield2) {
        this.oBoolfield2 = oBoolfield2;
    }
}