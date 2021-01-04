package com.accp.pojo;

import java.util.Date;

public class Employee {
    private Integer eid;

    private Integer jurisdictionid;

    private Integer shopid;

    private Integer etypeid;

    private Integer staffaeid;

    private Integer stationid;

    private Integer dimissionid;

    private Integer groupid;

    private String eno;

    private String ename;

    private String eaccount;

    private String epwd;

    private Integer esex;

    private String ephone;

    private String eemail;

    private String eaddress;

    private Date einputdate;

    private String ecurriculumvitae;

    private String eimage;

    private String eidentity;

    private Integer deid;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getJurisdictionid() {
        return jurisdictionid;
    }

    public void setJurisdictionid(Integer jurisdictionid) {
        this.jurisdictionid = jurisdictionid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getEtypeid() {
        return etypeid;
    }

    public void setEtypeid(Integer etypeid) {
        this.etypeid = etypeid;
    }

    public Integer getStaffaeid() {
        return staffaeid;
    }

    public void setStaffaeid(Integer staffaeid) {
        this.staffaeid = staffaeid;
    }

    public Integer getStationid() {
        return stationid;
    }

    public void setStationid(Integer stationid) {
        this.stationid = stationid;
    }

    public Integer getDimissionid() {
        return dimissionid;
    }

    public void setDimissionid(Integer dimissionid) {
        this.dimissionid = dimissionid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno == null ? null : eno.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEaccount() {
        return eaccount;
    }

    public void setEaccount(String eaccount) {
        this.eaccount = eaccount == null ? null : eaccount.trim();
    }

    public String getEpwd() {
        return epwd;
    }

    public void setEpwd(String epwd) {
        this.epwd = epwd == null ? null : epwd.trim();
    }

    public Integer getEsex() {
        return esex;
    }

    public void setEsex(Integer esex) {
        this.esex = esex;
    }

    public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone == null ? null : ephone.trim();
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail == null ? null : eemail.trim();
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress == null ? null : eaddress.trim();
    }

    public Date getEinputdate() {
        return einputdate;
    }

    public void setEinputdate(Date einputdate) {
        this.einputdate = einputdate;
    }

    public String getEcurriculumvitae() {
        return ecurriculumvitae;
    }

    public void setEcurriculumvitae(String ecurriculumvitae) {
        this.ecurriculumvitae = ecurriculumvitae == null ? null : ecurriculumvitae.trim();
    }

    public String getEimage() {
        return eimage;
    }

    public void setEimage(String eimage) {
        this.eimage = eimage == null ? null : eimage.trim();
    }

    public String getEidentity() {
        return eidentity;
    }

    public void setEidentity(String eidentity) {
        this.eidentity = eidentity == null ? null : eidentity.trim();
    }

    public Integer getDeid() {
        return deid;
    }

    public void setDeid(Integer deid) {
        this.deid = deid;
    }
}