package com.accp.pojo;

public class Artisans {
    private Integer artisansid;

    private Integer gclassifyid;

    private String artisansname;

    public Integer getArtisansid() {
        return artisansid;
    }

    public void setArtisansid(Integer artisansid) {
        this.artisansid = artisansid;
    }

    public Integer getGclassifyid() {
        return gclassifyid;
    }

    public void setGclassifyid(Integer gclassifyid) {
        this.gclassifyid = gclassifyid;
    }

    public String getArtisansname() {
        return artisansname;
    }

    public void setArtisansname(String artisansname) {
        this.artisansname = artisansname == null ? null : artisansname.trim();
    }
}