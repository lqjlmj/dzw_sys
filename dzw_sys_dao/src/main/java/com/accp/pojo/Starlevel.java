package com.accp.pojo;

public class Starlevel {
    private Integer starid;

    private String starname;

    private Float multiple;

    public Integer getStarid() {
        return starid;
    }

    public void setStarid(Integer starid) {
        this.starid = starid;
    }

    public String getStarname() {
        return starname;
    }

    public void setStarname(String starname) {
        this.starname = starname == null ? null : starname.trim();
    }

    public Float getMultiple() {
        return multiple;
    }

    public void setMultiple(Float multiple) {
        this.multiple = multiple;
    }
}