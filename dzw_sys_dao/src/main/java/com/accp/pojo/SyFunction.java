package com.accp.pojo;

import java.util.Date;

public class SyFunction {
    private Integer syfunctionid;

    private String syfunctionname;

    private String syfunctioncode;

    private Integer uplv;

    private Date createdate;

    public Integer getSyfunctionid() {
        return syfunctionid;
    }

    public void setSyfunctionid(Integer syfunctionid) {
        this.syfunctionid = syfunctionid;
    }

    public String getSyfunctionname() {
        return syfunctionname;
    }

    public void setSyfunctionname(String syfunctionname) {
        this.syfunctionname = syfunctionname == null ? null : syfunctionname.trim();
    }

    public String getSyfunctioncode() {
        return syfunctioncode;
    }

    public void setSyfunctioncode(String syfunctioncode) {
        this.syfunctioncode = syfunctioncode == null ? null : syfunctioncode.trim();
    }

    public Integer getUplv() {
        return uplv;
    }

    public void setUplv(Integer uplv) {
        this.uplv = uplv;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}