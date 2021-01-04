package com.accp.pojo;

public class Affiliation {
    private Integer affiliationid;

    private String affiliationname;

    public Integer getAffiliationid() {
        return affiliationid;
    }

    public void setAffiliationid(Integer affiliationid) {
        this.affiliationid = affiliationid;
    }

    public String getAffiliationname() {
        return affiliationname;
    }

    public void setAffiliationname(String affiliationname) {
        this.affiliationname = affiliationname == null ? null : affiliationname.trim();
    }
}