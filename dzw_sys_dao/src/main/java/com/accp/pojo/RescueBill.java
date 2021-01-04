package com.accp.pojo;

import java.util.Date;

public class RescueBill {
    private Integer rescuebillid;

    private Integer clearingformid;

    private Integer shifstid;

    private Integer uvehicleid;

    private Integer armemberid;

    private Integer artisansid;

    private Integer servicestateid;

    private Integer settleid;

    private String rescuebillno;

    private Date gooff;

    private Date arrivaltime;

    private Date workingtime;

    private String rbsaddress;

    private String downtown;

    private Date finishtime;

    private Float finishprice;

    private String wxremarks;

    private String resdriver;

    private String resphone;

    public Integer getRescuebillid() {
        return rescuebillid;
    }

    public void setRescuebillid(Integer rescuebillid) {
        this.rescuebillid = rescuebillid;
    }

    public Integer getClearingformid() {
        return clearingformid;
    }

    public void setClearingformid(Integer clearingformid) {
        this.clearingformid = clearingformid;
    }

    public Integer getShifstid() {
        return shifstid;
    }

    public void setShifstid(Integer shifstid) {
        this.shifstid = shifstid;
    }

    public Integer getUvehicleid() {
        return uvehicleid;
    }

    public void setUvehicleid(Integer uvehicleid) {
        this.uvehicleid = uvehicleid;
    }

    public Integer getArmemberid() {
        return armemberid;
    }

    public void setArmemberid(Integer armemberid) {
        this.armemberid = armemberid;
    }

    public Integer getArtisansid() {
        return artisansid;
    }

    public void setArtisansid(Integer artisansid) {
        this.artisansid = artisansid;
    }

    public Integer getServicestateid() {
        return servicestateid;
    }

    public void setServicestateid(Integer servicestateid) {
        this.servicestateid = servicestateid;
    }

    public Integer getSettleid() {
        return settleid;
    }

    public void setSettleid(Integer settleid) {
        this.settleid = settleid;
    }

    public String getRescuebillno() {
        return rescuebillno;
    }

    public void setRescuebillno(String rescuebillno) {
        this.rescuebillno = rescuebillno == null ? null : rescuebillno.trim();
    }

    public Date getGooff() {
        return gooff;
    }

    public void setGooff(Date gooff) {
        this.gooff = gooff;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public Date getWorkingtime() {
        return workingtime;
    }

    public void setWorkingtime(Date workingtime) {
        this.workingtime = workingtime;
    }

    public String getRbsaddress() {
        return rbsaddress;
    }

    public void setRbsaddress(String rbsaddress) {
        this.rbsaddress = rbsaddress == null ? null : rbsaddress.trim();
    }

    public String getDowntown() {
        return downtown;
    }

    public void setDowntown(String downtown) {
        this.downtown = downtown == null ? null : downtown.trim();
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Float getFinishprice() {
        return finishprice;
    }

    public void setFinishprice(Float finishprice) {
        this.finishprice = finishprice;
    }

    public String getWxremarks() {
        return wxremarks;
    }

    public void setWxremarks(String wxremarks) {
        this.wxremarks = wxremarks == null ? null : wxremarks.trim();
    }

    public String getResdriver() {
        return resdriver;
    }

    public void setResdriver(String resdriver) {
        this.resdriver = resdriver == null ? null : resdriver.trim();
    }

    public String getResphone() {
        return resphone;
    }

    public void setResphone(String resphone) {
        this.resphone = resphone == null ? null : resphone.trim();
    }
}