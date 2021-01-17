package com.accp.vo;

import java.util.Date;

public class EmployeeVo {
	private Integer eid;

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
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaccount() {
		return eaccount;
	}

	public void setEaccount(String eaccount) {
		this.eaccount = eaccount;
	}

	public String getEpwd() {
		return epwd;
	}

	public void setEpwd(String epwd) {
		this.epwd = epwd;
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
		this.ephone = ephone;
	}

	public String getEemail() {
		return eemail;
	}

	public void setEemail(String eemail) {
		this.eemail = eemail;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
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
		this.ecurriculumvitae = ecurriculumvitae;
	}

	public String getEimage() {
		return eimage;
	}

	public void setEimage(String eimage) {
		this.eimage = eimage;
	}

	public String getEidentity() {
		return eidentity;
	}

	public void setEidentity(String eidentity) {
		this.eidentity = eidentity;
	}

	public Integer getDeid() {
		return deid;
	}

	public void setDeid(Integer deid) {
		this.deid = deid;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getDename() {
		return dename;
	}

	public void setDename(String dename) {
		this.dename = dename;
	}

	public String getStationname() {
		return stationname;
	}

	public void setStationname(String stationname) {
		this.stationname = stationname;
	}

	public String getDimissioncause() {
		return dimissioncause;
	}

	public void setDimissioncause(String dimissioncause) {
		this.dimissioncause = dimissioncause;
	}

	public Date getDimissiondate() {
		return dimissiondate;
	}

	public void setDimissiondate(Date dimissiondate) {
		this.dimissiondate = dimissiondate;
	}

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
    
    //private Integer groupid;

    //private Integer deid;

    private String groupname;
    
    //private Integer deid;

    //private Integer shopid;

    private String dename;
    
    //private Integer stationid;

    private String stationname;
    
    //private Integer dimissionid;

    private String dimissioncause;

    private Date dimissiondate;

	public EmployeeVo(Integer eid, Integer jurisdictionid, Integer shopid, Integer etypeid, Integer staffaeid,
			Integer stationid, Integer dimissionid, Integer groupid, String eno, String ename, String eaccount,
			String epwd, Integer esex, String ephone, String eemail, String eaddress, Date einputdate,
			String ecurriculumvitae, String eimage, String eidentity, Integer deid, String groupname, String dename,
			String stationname, String dimissioncause, Date dimissiondate) {
		super();
		this.eid = eid;
		this.jurisdictionid = jurisdictionid;
		this.shopid = shopid;
		this.etypeid = etypeid;
		this.staffaeid = staffaeid;
		this.stationid = stationid;
		this.dimissionid = dimissionid;
		this.groupid = groupid;
		this.eno = eno;
		this.ename = ename;
		this.eaccount = eaccount;
		this.epwd = epwd;
		this.esex = esex;
		this.ephone = ephone;
		this.eemail = eemail;
		this.eaddress = eaddress;
		this.einputdate = einputdate;
		this.ecurriculumvitae = ecurriculumvitae;
		this.eimage = eimage;
		this.eidentity = eidentity;
		this.deid = deid;
		this.groupname = groupname;
		this.dename = dename;
		this.stationname = stationname;
		this.dimissioncause = dimissioncause;
		this.dimissiondate = dimissiondate;
	}
	public EmployeeVo(){
		super();
	}

    //private Integer eid;
    
    
}
