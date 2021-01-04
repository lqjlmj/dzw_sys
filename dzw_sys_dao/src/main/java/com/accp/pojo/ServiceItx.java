package com.accp.pojo;

public class ServiceItx {
    private Integer serviceitxid;

    private Integer serviceitid;

    private String senamex;

    public Integer getServiceitxid() {
        return serviceitxid;
    }

    public void setServiceitxid(Integer serviceitxid) {
        this.serviceitxid = serviceitxid;
    }

    public Integer getServiceitid() {
        return serviceitid;
    }

    public void setServiceitid(Integer serviceitid) {
        this.serviceitid = serviceitid;
    }

    public String getSenamex() {
        return senamex;
    }

    public void setSenamex(String senamex) {
        this.senamex = senamex == null ? null : senamex.trim();
    }
}