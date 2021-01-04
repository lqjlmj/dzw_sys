package com.accp.pojo;

public class VehicleBrand {
    private Integer vbrandid;

    private String vbrandno;

    private String vbrandname;

    public Integer getVbrandid() {
        return vbrandid;
    }

    public void setVbrandid(Integer vbrandid) {
        this.vbrandid = vbrandid;
    }

    public String getVbrandno() {
        return vbrandno;
    }

    public void setVbrandno(String vbrandno) {
        this.vbrandno = vbrandno == null ? null : vbrandno.trim();
    }

    public String getVbrandname() {
        return vbrandname;
    }

    public void setVbrandname(String vbrandname) {
        this.vbrandname = vbrandname == null ? null : vbrandname.trim();
    }
}