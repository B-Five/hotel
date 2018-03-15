package com.lllllw.hotel.model;

import java.util.Date;

public class Services {
    private Integer seId;

    private Integer seOid;

    private Integer seTid;

    private Date seCreated;

    private Date seUpdated;

    private String seOrder;

    private Date seOtime;

    private Boolean seStatus;

    private String seRemarks;

    private Integer seIntfield1;

    private Integer seIntfield2;

    private String seStringfield1;

    private String seStringfield2;

    private Date seDatefield1;

    private Date seDatefield2;

    private Date seDatetimefield1;

    private Date seDatetimefield2;

    private Boolean seBooleanfield1;

    private Boolean seBooleanfield2;

    public Integer getSeId() {
        return seId;
    }

    public void setSeId(Integer seId) {
        this.seId = seId;
    }

    public Integer getSeOid() {
        return seOid;
    }

    public void setSeOid(Integer seOid) {
        this.seOid = seOid;
    }

    public Integer getSeTid() {
        return seTid;
    }

    public void setSeTid(Integer seTid) {
        this.seTid = seTid;
    }

    public Date getSeCreated() {
        return seCreated;
    }

    public void setSeCreated(Date seCreated) {
        this.seCreated = seCreated;
    }

    public Date getSeUpdated() {
        return seUpdated;
    }

    public void setSeUpdated(Date seUpdated) {
        this.seUpdated = seUpdated;
    }

    public String getSeOrder() {
        return seOrder;
    }

    public void setSeOrder(String seOrder) {
        this.seOrder = seOrder == null ? null : seOrder.trim();
    }

    public Date getSeOtime() {
        return seOtime;
    }

    public void setSeOtime(Date seOtime) {
        this.seOtime = seOtime;
    }

    public Boolean getSeStatus() {
        return seStatus;
    }

    public void setSeStatus(Boolean seStatus) {
        this.seStatus = seStatus;
    }

    public String getSeRemarks() {
        return seRemarks;
    }

    public void setSeRemarks(String seRemarks) {
        this.seRemarks = seRemarks == null ? null : seRemarks.trim();
    }

    public Integer getSeIntfield1() {
        return seIntfield1;
    }

    public void setSeIntfield1(Integer seIntfield1) {
        this.seIntfield1 = seIntfield1;
    }

    public Integer getSeIntfield2() {
        return seIntfield2;
    }

    public void setSeIntfield2(Integer seIntfield2) {
        this.seIntfield2 = seIntfield2;
    }

    public String getSeStringfield1() {
        return seStringfield1;
    }

    public void setSeStringfield1(String seStringfield1) {
        this.seStringfield1 = seStringfield1 == null ? null : seStringfield1.trim();
    }

    public String getSeStringfield2() {
        return seStringfield2;
    }

    public void setSeStringfield2(String seStringfield2) {
        this.seStringfield2 = seStringfield2 == null ? null : seStringfield2.trim();
    }

    public Date getSeDatefield1() {
        return seDatefield1;
    }

    public void setSeDatefield1(Date seDatefield1) {
        this.seDatefield1 = seDatefield1;
    }

    public Date getSeDatefield2() {
        return seDatefield2;
    }

    public void setSeDatefield2(Date seDatefield2) {
        this.seDatefield2 = seDatefield2;
    }

    public Date getSeDatetimefield1() {
        return seDatetimefield1;
    }

    public void setSeDatetimefield1(Date seDatetimefield1) {
        this.seDatetimefield1 = seDatetimefield1;
    }

    public Date getSeDatetimefield2() {
        return seDatetimefield2;
    }

    public void setSeDatetimefield2(Date seDatetimefield2) {
        this.seDatetimefield2 = seDatetimefield2;
    }

    public Boolean getSeBooleanfield1() {
        return seBooleanfield1;
    }

    public void setSeBooleanfield1(Boolean seBooleanfield1) {
        this.seBooleanfield1 = seBooleanfield1;
    }

    public Boolean getSeBooleanfield2() {
        return seBooleanfield2;
    }

    public void setSeBooleanfield2(Boolean seBooleanfield2) {
        this.seBooleanfield2 = seBooleanfield2;
    }
}