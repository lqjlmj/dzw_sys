package com.accp.pojo;

public class GroupClassify {
    private Integer gclassifyid;

    private String gclassifyname;

    public Integer getGclassifyid() {
        return gclassifyid;
    }

    public void setGclassifyid(Integer gclassifyid) {
        this.gclassifyid = gclassifyid;
    }

    public String getGclassifyname() {
        return gclassifyname;
    }

    public void setGclassifyname(String gclassifyname) {
        this.gclassifyname = gclassifyname == null ? null : gclassifyname.trim();
    }
}