package com.lllllw.hotel.model;

import java.util.Date;

public class Staff {
    private Integer sId;

    private String sCode;

    private String sName;

    private String sPssword;

    private String sGender;

    private String sJob;

    private Integer sPermission;

    private String sRemarks;

    private Date sCreated;

    private Date sUpdated;

    private Integer sIntfield1;

    private Integer sIntfield2;

    private String sStringfield1;

    private String sStringfield2;

    private Date sDatefield1;

    private Date sDatefield2;

    private Date sDatetimefield1;

    private Date sDatetimefield2;

    private Boolean sBooleanfield1;

    private Boolean sBooleanfield2;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode == null ? null : sCode.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPssword() {
        return sPssword;
    }

    public void setsPssword(String sPssword) {
        this.sPssword = sPssword == null ? null : sPssword.trim();
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender == null ? null : sGender.trim();
    }

    public String getsJob() {
        return sJob;
    }

    public void setsJob(String sJob) {
        this.sJob = sJob == null ? null : sJob.trim();
    }

    public Integer getsPermission() {
        return sPermission;
    }

    public void setsPermission(Integer sPermission) {
        this.sPermission = sPermission;
    }

    public String getsRemarks() {
        return sRemarks;
    }

    public void setsRemarks(String sRemarks) {
        this.sRemarks = sRemarks == null ? null : sRemarks.trim();
    }

    public Date getsCreated() {
        return sCreated;
    }

    public void setsCreated(Date sCreated) {
        this.sCreated = sCreated;
    }

    public Date getsUpdated() {
        return sUpdated;
    }

    public void setsUpdated(Date sUpdated) {
        this.sUpdated = sUpdated;
    }

    public Integer getsIntfield1() {
        return sIntfield1;
    }

    public void setsIntfield1(Integer sIntfield1) {
        this.sIntfield1 = sIntfield1;
    }

    public Integer getsIntfield2() {
        return sIntfield2;
    }

    public void setsIntfield2(Integer sIntfield2) {
        this.sIntfield2 = sIntfield2;
    }

    public String getsStringfield1() {
        return sStringfield1;
    }

    public void setsStringfield1(String sStringfield1) {
        this.sStringfield1 = sStringfield1 == null ? null : sStringfield1.trim();
    }

    public String getsStringfield2() {
        return sStringfield2;
    }

    public void setsStringfield2(String sStringfield2) {
        this.sStringfield2 = sStringfield2 == null ? null : sStringfield2.trim();
    }

    public Date getsDatefield1() {
        return sDatefield1;
    }

    public void setsDatefield1(Date sDatefield1) {
        this.sDatefield1 = sDatefield1;
    }

    public Date getsDatefield2() {
        return sDatefield2;
    }

    public void setsDatefield2(Date sDatefield2) {
        this.sDatefield2 = sDatefield2;
    }

    public Date getsDatetimefield1() {
        return sDatetimefield1;
    }

    public void setsDatetimefield1(Date sDatetimefield1) {
        this.sDatetimefield1 = sDatetimefield1;
    }

    public Date getsDatetimefield2() {
        return sDatetimefield2;
    }

    public void setsDatetimefield2(Date sDatetimefield2) {
        this.sDatetimefield2 = sDatetimefield2;
    }

    public Boolean getsBooleanfield1() {
        return sBooleanfield1;
    }

    public void setsBooleanfield1(Boolean sBooleanfield1) {
        this.sBooleanfield1 = sBooleanfield1;
    }

    public Boolean getsBooleanfield2() {
        return sBooleanfield2;
    }

    public void setsBooleanfield2(Boolean sBooleanfield2) {
        this.sBooleanfield2 = sBooleanfield2;
    }
}