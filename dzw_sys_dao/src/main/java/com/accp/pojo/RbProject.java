package com.accp.pojo;

public class RbProject {
    private Integer rbprojectid;

    private Integer mnpricetypeid;

    private Integer serviceitemid;

    private String repairbillsno;

    private Integer artisansid;

    private Integer armemberid;

    private String rbprojectno;

    private Integer rbprojectsl;

    private String rbprojectms;

    private String rbprojectyy;

    private Float yprice;

    private Float yprices;

    private String nocharge;

    public Integer getRbprojectid() {
        return rbprojectid;
    }

    public void setRbprojectid(Integer rbprojectid) {
        this.rbprojectid = rbprojectid;
    }

    public Integer getMnpricetypeid() {
        return mnpricetypeid;
    }

    public void setMnpricetypeid(Integer mnpricetypeid) {
        this.mnpricetypeid = mnpricetypeid;
    }

    public Integer getServiceitemid() {
        return serviceitemid;
    }

    public void setServiceitemid(Integer serviceitemid) {
        this.serviceitemid = serviceitemid;
    }

    public String getRepairbillsno() {
        return repairbillsno;
    }

    public void setRepairbillsno(String repairbillsno) {
        this.repairbillsno = repairbillsno == null ? null : repairbillsno.trim();
    }

    public Integer getArtisansid() {
        return artisansid;
    }

    public void setArtisansid(Integer artisansid) {
        this.artisansid = artisansid;
    }

    public Integer getArmemberid() {
        return armemberid;
    }

    public void setArmemberid(Integer armemberid) {
        this.armemberid = armemberid;
    }

    public String getRbprojectno() {
        return rbprojectno;
    }

    public void setRbprojectno(String rbprojectno) {
        this.rbprojectno = rbprojectno == null ? null : rbprojectno.trim();
    }

    public Integer getRbprojectsl() {
        return rbprojectsl;
    }

    public void setRbprojectsl(Integer rbprojectsl) {
        this.rbprojectsl = rbprojectsl;
    }

    public String getRbprojectms() {
        return rbprojectms;
    }

    public void setRbprojectms(String rbprojectms) {
        this.rbprojectms = rbprojectms == null ? null : rbprojectms.trim();
    }

    public String getRbprojectyy() {
        return rbprojectyy;
    }

    public void setRbprojectyy(String rbprojectyy) {
        this.rbprojectyy = rbprojectyy == null ? null : rbprojectyy.trim();
    }

    public Float getYprice() {
        return yprice;
    }

    public void setYprice(Float yprice) {
        this.yprice = yprice;
    }

    public Float getYprices() {
        return yprices;
    }

    public void setYprices(Float yprices) {
        this.yprices = yprices;
    }

    public String getNocharge() {
        return nocharge;
    }

    public void setNocharge(String nocharge) {
        this.nocharge = nocharge == null ? null : nocharge.trim();
    }
}