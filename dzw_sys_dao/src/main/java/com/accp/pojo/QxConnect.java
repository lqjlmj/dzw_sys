package com.accp.pojo;

import java.util.Date;

public class QxConnect {
    private Integer qxconnectid;

    private Integer jurisdictionid;

    private Integer syfunctionid;

    private Date creatdate;

    private String createby;

    public Integer getQxconnectid() {
        return qxconnectid;
    }

    public void setQxconnectid(Integer qxconnectid) {
        this.qxconnectid = qxconnectid;
    }

    public Integer getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(Integer jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    public Integer getSyfunctionid() {
        return syfunctionid;
    }

    public void setSyfunctionid(Integer syfunctionid) {
        this.syfunctionid = syfunctionid;
    }

    public Date getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(Date creatdate) {
        this.creatdate = creatdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }
}