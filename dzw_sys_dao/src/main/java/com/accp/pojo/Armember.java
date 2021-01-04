package com.accp.pojo;

public class Armember {
    private Integer armemberid;

    private Integer artisansid;

    private Integer starid;

    private String ararmemberno;

    private String armembername;

    private Integer ararmembersex;

    private Integer isar;

    private String araccount;

    private String arphone;

    private String araddress;

    private String worktype;

    private String keepclass;

    private String arapwd;

    public Integer getArmemberid() {
        return armemberid;
    }

    public void setArmemberid(Integer armemberid) {
        this.armemberid = armemberid;
    }

    public Integer getArtisansid() {
        return artisansid;
    }

    public void setArtisansid(Integer artisansid) {
        this.artisansid = artisansid;
    }

    public Integer getStarid() {
        return starid;
    }

    public void setStarid(Integer starid) {
        this.starid = starid;
    }

    public String getArarmemberno() {
        return ararmemberno;
    }

    public void setArarmemberno(String ararmemberno) {
        this.ararmemberno = ararmemberno == null ? null : ararmemberno.trim();
    }

    public String getArmembername() {
        return armembername;
    }

    public void setArmembername(String armembername) {
        this.armembername = armembername == null ? null : armembername.trim();
    }

    public Integer getArarmembersex() {
        return ararmembersex;
    }

    public void setArarmembersex(Integer ararmembersex) {
        this.ararmembersex = ararmembersex;
    }

    public Integer getIsar() {
        return isar;
    }

    public void setIsar(Integer isar) {
        this.isar = isar;
    }

    public String getAraccount() {
        return araccount;
    }

    public void setAraccount(String araccount) {
        this.araccount = araccount == null ? null : araccount.trim();
    }

    public String getArphone() {
        return arphone;
    }

    public void setArphone(String arphone) {
        this.arphone = arphone == null ? null : arphone.trim();
    }

    public String getAraddress() {
        return araddress;
    }

    public void setAraddress(String araddress) {
        this.araddress = araddress == null ? null : araddress.trim();
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }

    public String getKeepclass() {
        return keepclass;
    }

    public void setKeepclass(String keepclass) {
        this.keepclass = keepclass == null ? null : keepclass.trim();
    }

    public String getArapwd() {
        return arapwd;
    }

    public void setArapwd(String arapwd) {
        this.arapwd = arapwd == null ? null : arapwd.trim();
    }
}