package com.accp.pojo;

public class Oilmass {
    private Integer oilmassid;

    private String oilmassname;

    public Integer getOilmassid() {
        return oilmassid;
    }

    public void setOilmassid(Integer oilmassid) {
        this.oilmassid = oilmassid;
    }

    public String getOilmassname() {
        return oilmassname;
    }

    public void setOilmassname(String oilmassname) {
        this.oilmassname = oilmassname == null ? null : oilmassname.trim();
    }
}