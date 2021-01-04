package com.accp.pojo;

public class MnpriceType {
    private Integer mnpricetypeid;

    private String mnpricetypename;

    public Integer getMnpricetypeid() {
        return mnpricetypeid;
    }

    public void setMnpricetypeid(Integer mnpricetypeid) {
        this.mnpricetypeid = mnpricetypeid;
    }

    public String getMnpricetypename() {
        return mnpricetypename;
    }

    public void setMnpricetypename(String mnpricetypename) {
        this.mnpricetypename = mnpricetypename == null ? null : mnpricetypename.trim();
    }
}