package com.accp.pojo;

import java.util.Date;

public class EndCheck {
    private Integer endcheckid;

    private String repairbillsno;

    private Integer checktype;

    private Date estimatetime;

    private Date realitytime;

    private String delaycause;

    private String returnworkcause;

    private String qualityinspector;

    private String responsibleperson;

    private Double punishprice;

    private Date generateddate;

    private String zherentype;

    public Integer getEndcheckid() {
        return endcheckid;
    }

    public void setEndcheckid(Integer endcheckid) {
        this.endcheckid = endcheckid;
    }

    public String getRepairbillsno() {
        return repairbillsno;
    }

    public void setRepairbillsno(String repairbillsno) {
        this.repairbillsno = repairbillsno == null ? null : repairbillsno.trim();
    }

    public Integer getChecktype() {
        return checktype;
    }

    public void setChecktype(Integer checktype) {
        this.checktype = checktype;
    }

    public Date getEstimatetime() {
        return estimatetime;
    }

    public void setEstimatetime(Date estimatetime) {
        this.estimatetime = estimatetime;
    }

    public Date getRealitytime() {
        return realitytime;
    }

    public void setRealitytime(Date realitytime) {
        this.realitytime = realitytime;
    }

    public String getDelaycause() {
        return delaycause;
    }

    public void setDelaycause(String delaycause) {
        this.delaycause = delaycause == null ? null : delaycause.trim();
    }

    public String getReturnworkcause() {
        return returnworkcause;
    }

    public void setReturnworkcause(String returnworkcause) {
        this.returnworkcause = returnworkcause == null ? null : returnworkcause.trim();
    }

    public String getQualityinspector() {
        return qualityinspector;
    }

    public void setQualityinspector(String qualityinspector) {
        this.qualityinspector = qualityinspector == null ? null : qualityinspector.trim();
    }

    public String getResponsibleperson() {
        return responsibleperson;
    }

    public void setResponsibleperson(String responsibleperson) {
        this.responsibleperson = responsibleperson == null ? null : responsibleperson.trim();
    }

    public Double getPunishprice() {
        return punishprice;
    }

    public void setPunishprice(Double punishprice) {
        this.punishprice = punishprice;
    }

    public Date getGenerateddate() {
        return generateddate;
    }

    public void setGenerateddate(Date generateddate) {
        this.generateddate = generateddate;
    }

    public String getZherentype() {
        return zherentype;
    }

    public void setZherentype(String zherentype) {
        this.zherentype = zherentype == null ? null : zherentype.trim();
    }
}