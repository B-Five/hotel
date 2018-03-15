package com.lllllw.hotel.model;

public class RoomType {
    private Integer tId;

    private String tName;

    private String tBed;

    private Integer tMember;

    private String tPo;

    private String tBath;

    private String tRemarks;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String gettBed() {
        return tBed;
    }

    public void settBed(String tBed) {
        this.tBed = tBed == null ? null : tBed.trim();
    }

    public Integer gettMember() {
        return tMember;
    }

    public void settMember(Integer tMember) {
        this.tMember = tMember;
    }

    public String gettPo() {
        return tPo;
    }

    public void settPo(String tPo) {
        this.tPo = tPo == null ? null : tPo.trim();
    }

    public String gettBath() {
        return tBath;
    }

    public void settBath(String tBath) {
        this.tBath = tBath == null ? null : tBath.trim();
    }

    public String gettRemarks() {
        return tRemarks;
    }

    public void settRemarks(String tRemarks) {
        this.tRemarks = tRemarks == null ? null : tRemarks.trim();
    }
}