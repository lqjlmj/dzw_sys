package com.accp.pojo;

import java.util.Date;

public class Statistics {
    private Integer stid;

    private String stname;

    private Date stdate;

    private Integer stcount;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname == null ? null : stname.trim();
    }

    public Date getStdate() {
        return stdate;
    }

    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    public Integer getStcount() {
        return stcount;
    }

    public void setStcount(Integer stcount) {
        this.stcount = stcount;
    }
}