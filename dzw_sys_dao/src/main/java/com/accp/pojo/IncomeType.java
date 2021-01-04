package com.accp.pojo;

public class IncomeType {
    private Integer incometypeid;

    private String incometypename;

    public Integer getIncometypeid() {
        return incometypeid;
    }

    public void setIncometypeid(Integer incometypeid) {
        this.incometypeid = incometypeid;
    }

    public String getIncometypename() {
        return incometypename;
    }

    public void setIncometypename(String incometypename) {
        this.incometypename = incometypename == null ? null : incometypename.trim();
    }
}