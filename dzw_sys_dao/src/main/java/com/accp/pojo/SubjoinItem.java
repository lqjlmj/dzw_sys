package com.accp.pojo;

public class SubjoinItem {
    private Integer subjoinitemid;

    private String repairbillsno;

    private String subjoinitemname;

    private Integer mnpricetypeid;

    private Double subjoinprice;

    private String remark;

    private Integer artisansid;

    private Integer subjointime;

    public Integer getSubjoinitemid() {
        return subjoinitemid;
    }

    public void setSubjoinitemid(Integer subjoinitemid) {
        this.subjoinitemid = subjoinitemid;
    }

    public String getRepairbillsno() {
        return repairbillsno;
    }

    public void setRepairbillsno(String repairbillsno) {
        this.repairbillsno = repairbillsno == null ? null : repairbillsno.trim();
    }

    public String getSubjoinitemname() {
        return subjoinitemname;
    }

    public void setSubjoinitemname(String subjoinitemname) {
        this.subjoinitemname = subjoinitemname == null ? null : subjoinitemname.trim();
    }

    public Integer getMnpricetypeid() {
        return mnpricetypeid;
    }

    public void setMnpricetypeid(Integer mnpricetypeid) {
        this.mnpricetypeid = mnpricetypeid;
    }

    public Double getSubjoinprice() {
        return subjoinprice;
    }

    public void setSubjoinprice(Double subjoinprice) {
        this.subjoinprice = subjoinprice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getArtisansid() {
        return artisansid;
    }

    public void setArtisansid(Integer artisansid) {
        this.artisansid = artisansid;
    }

    public Integer getSubjointime() {
        return subjointime;
    }

    public void setSubjointime(Integer subjointime) {
        this.subjointime = subjointime;
    }
}