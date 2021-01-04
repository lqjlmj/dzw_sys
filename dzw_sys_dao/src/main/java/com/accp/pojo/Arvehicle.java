package com.accp.pojo;

public class Arvehicle {
    private Integer arvehicleid;

    private Integer vbrandid;

    private Integer vtypeid;

    private Integer artisansid;

    private String arlicense;

    private String arvehiclekm;

    public Integer getArvehicleid() {
        return arvehicleid;
    }

    public void setArvehicleid(Integer arvehicleid) {
        this.arvehicleid = arvehicleid;
    }

    public Integer getVbrandid() {
        return vbrandid;
    }

    public void setVbrandid(Integer vbrandid) {
        this.vbrandid = vbrandid;
    }

    public Integer getVtypeid() {
        return vtypeid;
    }

    public void setVtypeid(Integer vtypeid) {
        this.vtypeid = vtypeid;
    }

    public Integer getArtisansid() {
        return artisansid;
    }

    public void setArtisansid(Integer artisansid) {
        this.artisansid = artisansid;
    }

    public String getArlicense() {
        return arlicense;
    }

    public void setArlicense(String arlicense) {
        this.arlicense = arlicense == null ? null : arlicense.trim();
    }

    public String getArvehiclekm() {
        return arvehiclekm;
    }

    public void setArvehiclekm(String arvehiclekm) {
        this.arvehiclekm = arvehiclekm == null ? null : arvehiclekm.trim();
    }
}