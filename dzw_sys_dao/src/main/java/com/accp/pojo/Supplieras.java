package com.accp.pojo;

public class Supplieras {
    private Integer supplierasid;

    private String supplierasname;

    private Integer parentid;

    public Integer getSupplierasid() {
        return supplierasid;
    }

    public void setSupplierasid(Integer supplierasid) {
        this.supplierasid = supplierasid;
    }

    public String getSupplierasname() {
        return supplierasname;
    }

    public void setSupplierasname(String supplierasname) {
        this.supplierasname = supplierasname == null ? null : supplierasname.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}