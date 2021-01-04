package com.accp.pojo;

import java.util.Date;

public class Dimissiontext {
    private Integer dimissionid;

    private String dimissioncause;

    private Date dimissiondate;

    private Integer eid;

    public Integer getDimissionid() {
        return dimissionid;
    }

    public void setDimissionid(Integer dimissionid) {
        this.dimissionid = dimissionid;
    }

    public String getDimissioncause() {
        return dimissioncause;
    }

    public void setDimissioncause(String dimissioncause) {
        this.dimissioncause = dimissioncause == null ? null : dimissioncause.trim();
    }

    public Date getDimissiondate() {
        return dimissiondate;
    }

    public void setDimissiondate(Date dimissiondate) {
        this.dimissiondate = dimissiondate;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}