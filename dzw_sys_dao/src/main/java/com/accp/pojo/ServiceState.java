package com.accp.pojo;

public class ServiceState {
    private Integer servicestateid;

    private String servicestatename;

    public Integer getServicestateid() {
        return servicestateid;
    }

    public void setServicestateid(Integer servicestateid) {
        this.servicestateid = servicestateid;
    }

    public String getServicestatename() {
        return servicestatename;
    }

    public void setServicestatename(String servicestatename) {
        this.servicestatename = servicestatename == null ? null : servicestatename.trim();
    }
}