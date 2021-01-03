package com.accp.pojo;

import java.util.Date;

public class Jurisdiction {
	private Integer jurisdictionid;
	private String jurisdictionname;
	private String jurisdictioncode;
	private Integer jurstatus;
	private Date createdate;
	private String createby;
	public Jurisdiction() {
		super();
	}
	public Jurisdiction(Integer jurisdictionid, String jurisdictionname, String jurisdictioncode, Integer jurstatus,
			Date createdate, String createby) {
		super();
		this.jurisdictionid = jurisdictionid;
		this.jurisdictionname = jurisdictionname;
		this.jurisdictioncode = jurisdictioncode;
		this.jurstatus = jurstatus;
		this.createdate = createdate;
		this.createby = createby;
	}
	public Integer getJurisdictionid() {
		return jurisdictionid;
	}
	public void setJurisdictionid(Integer jurisdictionid) {
		this.jurisdictionid = jurisdictionid;
	}
	public String getJurisdictionname() {
		return jurisdictionname;
	}
	public void setJurisdictionname(String jurisdictionname) {
		this.jurisdictionname = jurisdictionname;
	}
	public String getJurisdictioncode() {
		return jurisdictioncode;
	}
	public void setJurisdictioncode(String jurisdictioncode) {
		this.jurisdictioncode = jurisdictioncode;
	}
	public Integer getJurstatus() {
		return jurstatus;
	}
	public void setJurstatus(Integer jurstatus) {
		this.jurstatus = jurstatus;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	@Override
	public String toString() {
		return "Jurisdiction [jurisdictionid=" + jurisdictionid + ", jurisdictionname=" + jurisdictionname
				+ ", jurisdictioncode=" + jurisdictioncode + ", jurstatus=" + jurstatus + ", createdate=" + createdate
				+ ", createby=" + createby + "]";
	}
}
