package com.accp.pojo;

import java.util.Date;

public class Billsettle {
    private Integer billsettleid;

    private String repairbillsno;

    private Integer userid;

    private Integer settleemploy;

    private Double settlesum;

    private Double finallyprice;

    private Double closeprice;

    private String settleremark;

    private String settletype;

    private Date settletime;

    public Integer getBillsettleid() {
        return billsettleid;
    }

    public void setBillsettleid(Integer billsettleid) {
        this.billsettleid = billsettleid;
    }

    public String getRepairbillsno() {
        return repairbillsno;
    }

    public void setRepairbillsno(String repairbillsno) {
        this.repairbillsno = repairbillsno == null ? null : repairbillsno.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSettleemploy() {
        return settleemploy;
    }

    public void setSettleemploy(Integer settleemploy) {
        this.settleemploy = settleemploy;
    }

    public Double getSettlesum() {
        return settlesum;
    }

    public void setSettlesum(Double settlesum) {
        this.settlesum = settlesum;
    }

    public Double getFinallyprice() {
        return finallyprice;
    }

    public void setFinallyprice(Double finallyprice) {
        this.finallyprice = finallyprice;
    }

    public Double getCloseprice() {
        return closeprice;
    }

    public void setCloseprice(Double closeprice) {
        this.closeprice = closeprice;
    }

    public String getSettleremark() {
        return settleremark;
    }

    public void setSettleremark(String settleremark) {
        this.settleremark = settleremark == null ? null : settleremark.trim();
    }

    public String getSettletype() {
        return settletype;
    }

    public void setSettletype(String settletype) {
        this.settletype = settletype == null ? null : settletype.trim();
    }

    public Date getSettletime() {
        return settletime;
    }

    public void setSettletime(Date settletime) {
        this.settletime = settletime;
    }
}