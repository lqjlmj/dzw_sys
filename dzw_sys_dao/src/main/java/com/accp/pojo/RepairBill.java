package com.accp.pojo;

import java.util.Date;

public class RepairBill {
    private Integer repairbillid;

    private String repairbillno;

    private Integer shifstid;

    private Integer serviceitid;

    private Integer clearingformid;

    private Integer settleid;

    private Integer uvehicleid;

    private Integer oilmassid;

    private Integer armemberid;

    private Integer servicestateid;

    private Date repairbilldate;

    private Date repairbilldated;

    private Date repairbilldates;

    private String receptionnote;

    private String statement;

    private String redriver;

    private String redriverphone;

    private Integer artisansid;

    private Date gooff;

    private Date arrivaltime;

    private Date workingtime;

    private String rbsaddress;

    private String downtown;

    private String servicetype;

    public Integer getRepairbillid() {
        return repairbillid;
    }

    public void setRepairbillid(Integer repairbillid) {
        this.repairbillid = repairbillid;
    }

    public String getRepairbillno() {
        return repairbillno;
    }

    public void setRepairbillno(String repairbillno) {
        this.repairbillno = repairbillno == null ? null : repairbillno.trim();
    }

    public Integer getShifstid() {
        return shifstid;
    }

    public void setShifstid(Integer shifstid) {
        this.shifstid = shifstid;
    }

    public Integer getServiceitid() {
        return serviceitid;
    }

    public void setServiceitid(Integer serviceitid) {
        this.serviceitid = serviceitid;
    }

    public Integer getClearingformid() {
        return clearingformid;
    }

    public void setClearingformid(Integer clearingformid) {
        this.clearingformid = clearingformid;
    }

    public Integer getSettleid() {
        return settleid;
    }

    public void setSettleid(Integer settleid) {
        this.settleid = settleid;
    }

    public Integer getUvehicleid() {
        return uvehicleid;
    }

    public void setUvehicleid(Integer uvehicleid) {
        this.uvehicleid = uvehicleid;
    }

    public Integer getOilmassid() {
        return oilmassid;
    }

    public void setOilmassid(Integer oilmassid) {
        this.oilmassid = oilmassid;
    }

    public Integer getArmemberid() {
        return armemberid;
    }

    public void setArmemberid(Integer armemberid) {
        this.armemberid = armemberid;
    }

    public Integer getServicestateid() {
        return servicestateid;
    }

    public void setServicestateid(Integer servicestateid) {
        this.servicestateid = servicestateid;
    }

    public Date getRepairbilldate() {
        return repairbilldate;
    }

    public void setRepairbilldate(Date repairbilldate) {
        this.repairbilldate = repairbilldate;
    }

    public Date getRepairbilldated() {
        return repairbilldated;
    }

    public void setRepairbilldated(Date repairbilldated) {
        this.repairbilldated = repairbilldated;
    }

    public Date getRepairbilldates() {
        return repairbilldates;
    }

    public void setRepairbilldates(Date repairbilldates) {
        this.repairbilldates = repairbilldates;
    }

    public String getReceptionnote() {
        return receptionnote;
    }

    public void setReceptionnote(String receptionnote) {
        this.receptionnote = receptionnote == null ? null : receptionnote.trim();
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    public String getRedriver() {
        return redriver;
    }

    public void setRedriver(String redriver) {
        this.redriver = redriver == null ? null : redriver.trim();
    }

    public String getRedriverphone() {
        return redriverphone;
    }

    public void setRedriverphone(String redriverphone) {
        this.redriverphone = redriverphone == null ? null : redriverphone.trim();
    }

    public Integer getArtisansid() {
        return artisansid;
    }

    public void setArtisansid(Integer artisansid) {
        this.artisansid = artisansid;
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

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype == null ? null : servicetype.trim();
    }
}