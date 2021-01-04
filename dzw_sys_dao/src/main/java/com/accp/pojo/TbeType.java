package com.accp.pojo;

public class TbeType {
    private Integer etypeid;

    private String etypename;

    public Integer getEtypeid() {
        return etypeid;
    }

    public void setEtypeid(Integer etypeid) {
        this.etypeid = etypeid;
    }

    public String getEtypename() {
        return etypename;
    }

    public void setEtypename(String etypename) {
        this.etypename = etypename == null ? null : etypename.trim();
    }
}