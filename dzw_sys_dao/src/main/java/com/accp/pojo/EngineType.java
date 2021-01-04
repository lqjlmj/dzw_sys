package com.accp.pojo;

public class EngineType {
    private Integer enginetypeid;

    private String enginetypename;

    public Integer getEnginetypeid() {
        return enginetypeid;
    }

    public void setEnginetypeid(Integer enginetypeid) {
        this.enginetypeid = enginetypeid;
    }

    public String getEnginetypename() {
        return enginetypename;
    }

    public void setEnginetypename(String enginetypename) {
        this.enginetypename = enginetypename == null ? null : enginetypename.trim();
    }
}