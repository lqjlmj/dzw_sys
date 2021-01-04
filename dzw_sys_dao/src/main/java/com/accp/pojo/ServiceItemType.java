package com.accp.pojo;

public class ServiceItemType {
    private Integer serviceitid;

    private String sename;

    public Integer getServiceitid() {
        return serviceitid;
    }

    public void setServiceitid(Integer serviceitid) {
        this.serviceitid = serviceitid;
    }

    public String getSename() {
        return sename;
    }

    public void setSename(String sename) {
        this.sename = sename == null ? null : sename.trim();
    }
}