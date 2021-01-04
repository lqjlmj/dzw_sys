package com.accp.pojo;

import java.util.Date;

public class UserVehicle {
    private Integer uvehicleid;

    private Integer vtypeid;

    private Integer vbrandid;

    private Integer userid;

    private Integer affiliationid;

    private String ulicense;

    private String resdriver;

    private String driverphone;

    private Integer umileage;

    private Date registereddate;

    private Date buydate;

    public Integer getUvehicleid() {
        return uvehicleid;
    }

    public void setUvehicleid(Integer uvehicleid) {
        this.uvehicleid = uvehicleid;
    }

    public Integer getVtypeid() {
        return vtypeid;
    }

    public void setVtypeid(Integer vtypeid) {
        this.vtypeid = vtypeid;
    }

    public Integer getVbrandid() {
        return vbrandid;
    }

    public void setVbrandid(Integer vbrandid) {
        this.vbrandid = vbrandid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getAffiliationid() {
        return affiliationid;
    }

    public void setAffiliationid(Integer affiliationid) {
        this.affiliationid = affiliationid;
    }

    public String getUlicense() {
        return ulicense;
    }

    public void setUlicense(String ulicense) {
        this.ulicense = ulicense == null ? null : ulicense.trim();
    }

    public String getResdriver() {
        return resdriver;
    }

    public void setResdriver(String resdriver) {
        this.resdriver = resdriver == null ? null : resdriver.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public Integer getUmileage() {
        return umileage;
    }

    public void setUmileage(Integer umileage) {
        this.umileage = umileage;
    }

    public Date getRegistereddate() {
        return registereddate;
    }

    public void setRegistereddate(Date registereddate) {
        this.registereddate = registereddate;
    }

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
        this.buydate = buydate;
    }
}