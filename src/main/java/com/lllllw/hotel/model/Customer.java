package com.lllllw.hotel.model;

import java.util.Date;

public class Customer {
    private Integer cId;

    private String cLastname;

    private String cFirstname;

    private String cPassword;

    private String cPhone;

    private String cEmail;

    private String cGender;

    private Date cCreated;

    private Date cUpdated;

    private Integer cIntfield1;

    private Integer cIntfield2;

    private String cStringfield1;

    private String cStringfield2;

    private Date cDatefield1;

    private Date cDatefield2;

    private Date cDatetimefield1;

    private Date cDatetimefield2;

    private Boolean cBoolfield1;

    private Boolean cBoolfield2;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcLastname() {
        return cLastname;
    }

    public void setcLastname(String cLastname) {
        this.cLastname = cLastname == null ? null : cLastname.trim();
    }

    public String getcFirstname() {
        return cFirstname;
    }

    public void setcFirstname(String cFirstname) {
        this.cFirstname = cFirstname == null ? null : cFirstname.trim();
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword == null ? null : cPassword.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail == null ? null : cEmail.trim();
    }

    public String getcGender() {
        return cGender;
    }

    public void setcGender(String cGender) {
        this.cGender = cGender == null ? null : cGender.trim();
    }

    public Date getcCreated() {
        return cCreated;
    }

    public void setcCreated(Date cCreated) {
        this.cCreated = cCreated;
    }

    public Date getcUpdated() {
        return cUpdated;
    }

    public void setcUpdated(Date cUpdated) {
        this.cUpdated = cUpdated;
    }

    public Integer getcIntfield1() {
        return cIntfield1;
    }

    public void setcIntfield1(Integer cIntfield1) {
        this.cIntfield1 = cIntfield1;
    }

    public Integer getcIntfield2() {
        return cIntfield2;
    }

    public void setcIntfield2(Integer cIntfield2) {
        this.cIntfield2 = cIntfield2;
    }

    public String getcStringfield1() {
        return cStringfield1;
    }

    public void setcStringfield1(String cStringfield1) {
        this.cStringfield1 = cStringfield1 == null ? null : cStringfield1.trim();
    }

    public String getcStringfield2() {
        return cStringfield2;
    }

    public void setcStringfield2(String cStringfield2) {
        this.cStringfield2 = cStringfield2 == null ? null : cStringfield2.trim();
    }

    public Date getcDatefield1() {
        return cDatefield1;
    }

    public void setcDatefield1(Date cDatefield1) {
        this.cDatefield1 = cDatefield1;
    }

    public Date getcDatefield2() {
        return cDatefield2;
    }

    public void setcDatefield2(Date cDatefield2) {
        this.cDatefield2 = cDatefield2;
    }

    public Date getcDatetimefield1() {
        return cDatetimefield1;
    }

    public void setcDatetimefield1(Date cDatetimefield1) {
        this.cDatetimefield1 = cDatetimefield1;
    }

    public Date getcDatetimefield2() {
        return cDatetimefield2;
    }

    public void setcDatetimefield2(Date cDatetimefield2) {
        this.cDatetimefield2 = cDatetimefield2;
    }

    public Boolean getcBoolfield1() {
        return cBoolfield1;
    }

    public void setcBoolfield1(Boolean cBoolfield1) {
        this.cBoolfield1 = cBoolfield1;
    }

    public Boolean getcBoolfield2() {
        return cBoolfield2;
    }

    public void setcBoolfield2(Boolean cBoolfield2) {
        this.cBoolfield2 = cBoolfield2;
    }
}