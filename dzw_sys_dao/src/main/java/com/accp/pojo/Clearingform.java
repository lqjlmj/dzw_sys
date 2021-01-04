package com.accp.pojo;

public class Clearingform {
    private Integer clearingformid;

    private String clearingformname;

    public Integer getClearingformid() {
        return clearingformid;
    }

    public void setClearingformid(Integer clearingformid) {
        this.clearingformid = clearingformid;
    }

    public String getClearingformname() {
        return clearingformname;
    }

    public void setClearingformname(String clearingformname) {
        this.clearingformname = clearingformname == null ? null : clearingformname.trim();
    }
}