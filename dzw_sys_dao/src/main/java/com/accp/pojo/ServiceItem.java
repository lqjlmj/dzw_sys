package com.accp.pojo;

public class ServiceItem {
    private Integer serviceitemid;

    private Integer incometypeid;

    private Integer serviceitxid;

    private String serviceitemno;

    private String serviceitemname;

    private String siremarks;

    private Double cpricesl;

    private Double vipprice;

    public Integer getServiceitemid() {
        return serviceitemid;
    }

    public void setServiceitemid(Integer serviceitemid) {
        this.serviceitemid = serviceitemid;
    }

    public Integer getIncometypeid() {
        return incometypeid;
    }

    public void setIncometypeid(Integer incometypeid) {
        this.incometypeid = incometypeid;
    }

    public Integer getServiceitxid() {
        return serviceitxid;
    }

    public void setServiceitxid(Integer serviceitxid) {
        this.serviceitxid = serviceitxid;
    }

    public String getServiceitemno() {
        return serviceitemno;
    }

    public void setServiceitemno(String serviceitemno) {
        this.serviceitemno = serviceitemno == null ? null : serviceitemno.trim();
    }

    public String getServiceitemname() {
        return serviceitemname;
    }

    public void setServiceitemname(String serviceitemname) {
        this.serviceitemname = serviceitemname == null ? null : serviceitemname.trim();
    }

    public String getSiremarks() {
        return siremarks;
    }

    public void setSiremarks(String siremarks) {
        this.siremarks = siremarks == null ? null : siremarks.trim();
    }

    public Double getCpricesl() {
        return cpricesl;
    }

    public void setCpricesl(Double cpricesl) {
        this.cpricesl = cpricesl;
    }

    public Double getVipprice() {
        return vipprice;
    }

    public void setVipprice(Double vipprice) {
        this.vipprice = vipprice;
    }
}