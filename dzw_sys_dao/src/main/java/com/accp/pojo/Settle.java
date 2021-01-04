package com.accp.pojo;

import java.util.Date;

public class Settle {
    private Integer settleid;

    private Integer eid;

    private String repairbillsno;

    private Date settletime;

    private Integer settleintegral;

    private Double settlesum;

    private Double closeprice;

    private Double materialspr;

    private Double manhourpr;

    private Double additionpr;

    private Double itemprice;

    private Double finallyprice;

    private Double rescueprice;

    private String settletype;

    public Integer getSettleid() {
        return settleid;
    }

    public void setSettleid(Integer settleid) {
        this.settleid = settleid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getRepairbillsno() {
        return repairbillsno;
    }

    public void setRepairbillsno(String repairbillsno) {
        this.repairbillsno = repairbillsno == null ? null : repairbillsno.trim();
    }

    public Date getSettletime() {
        return settletime;
    }

    public void setSettletime(Date settletime) {
        this.settletime = settletime;
    }

    public Integer getSettleintegral() {
        return settleintegral;
    }

    public void setSettleintegral(Integer settleintegral) {
        this.settleintegral = settleintegral;
    }

    public Double getSettlesum() {
        return settlesum;
    }

    public void setSettlesum(Double settlesum) {
        this.settlesum = settlesum;
    }

    public Double getCloseprice() {
        return closeprice;
    }

    public void setCloseprice(Double closeprice) {
        this.closeprice = closeprice;
    }

    public Double getMaterialspr() {
        return materialspr;
    }

    public void setMaterialspr(Double materialspr) {
        this.materialspr = materialspr;
    }

    public Double getManhourpr() {
        return manhourpr;
    }

    public void setManhourpr(Double manhourpr) {
        this.manhourpr = manhourpr;
    }

    public Double getAdditionpr() {
        return additionpr;
    }

    public void setAdditionpr(Double additionpr) {
        this.additionpr = additionpr;
    }

    public Double getItemprice() {
        return itemprice;
    }

    public void setItemprice(Double itemprice) {
        this.itemprice = itemprice;
    }

    public Double getFinallyprice() {
        return finallyprice;
    }

    public void setFinallyprice(Double finallyprice) {
        this.finallyprice = finallyprice;
    }

    public Double getRescueprice() {
        return rescueprice;
    }

    public void setRescueprice(Double rescueprice) {
        this.rescueprice = rescueprice;
    }

    public String getSettletype() {
        return settletype;
    }

    public void setSettletype(String settletype) {
        this.settletype = settletype == null ? null : settletype.trim();
    }
}