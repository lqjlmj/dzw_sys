package com.accp.pojo;

import java.util.Date;

public class VehicleTypeVo {

	 private Integer vbrandid;
	
	 public Integer getVbrandid() {
		return vbrandid;
	}

	public void setVbrandid(Integer vbrandid) {
		this.vbrandid = vbrandid;
	}

	private Integer vtypeid;

	    private Integer enginetypeid;

	    private String vtypeno;

	    private String vtypename;

	    private Float vprice;

	    private Date vdate;

	    private Integer vpower;

	    private String fuelmark;
	    
	    private String enginetypename;

	    private String vbrandname;
	    
		public String getVbrandname() {
			return vbrandname;
		}

		public void setVbrandname(String vbrandname) {
			this.vbrandname = vbrandname;
		}

		public Integer getVtypeid() {
			return vtypeid;
		}

		public void setVtypeid(Integer vtypeid) {
			this.vtypeid = vtypeid;
		}

		public Integer getEnginetypeid() {
			return enginetypeid;
		}

		public void setEnginetypeid(Integer enginetypeid) {
			this.enginetypeid = enginetypeid;
		}

		public String getVtypeno() {
			return vtypeno;
		}

		public void setVtypeno(String vtypeno) {
			this.vtypeno = vtypeno;
		}

		public String getVtypename() {
			return vtypename;
		}

		public void setVtypename(String vtypename) {
			this.vtypename = vtypename;
		}

		public Float getVprice() {
			return vprice;
		}

		public void setVprice(Float vprice) {
			this.vprice = vprice;
		}

		public Date getVdate() {
			return vdate;
		}

		public void setVdate(Date vdate) {
			this.vdate = vdate;
		}

		public Integer getVpower() {
			return vpower;
		}

		public void setVpower(Integer vpower) {
			this.vpower = vpower;
		}

		public String getFuelmark() {
			return fuelmark;
		}

		public void setFuelmark(String fuelmark) {
			this.fuelmark = fuelmark;
		}

		public String getEnginetypename() {
			return enginetypename;
		}

		public void setEnginetypename(String enginetypename) {
			this.enginetypename = enginetypename;
		}


		
		@Override
		public String toString() {
			return "VehicleTypeVo [vbrandid=" + vbrandid + ", vtypeid=" + vtypeid + ", enginetypeid=" + enginetypeid
					+ ", vtypeno=" + vtypeno + ", vtypename=" + vtypename + ", vprice=" + vprice + ", vdate=" + vdate
					+ ", vpower=" + vpower + ", fuelmark=" + fuelmark + ", enginetypename=" + enginetypename
					+ ", vbrandname=" + vbrandname + "]";
		}

		public VehicleTypeVo(Integer vbrandid, Integer vtypeid, Integer enginetypeid, String vtypeno, String vtypename,
				Float vprice, Date vdate, Integer vpower, String fuelmark, String enginetypename, String vbrandname) {
			super();
			this.vbrandid = vbrandid;
			this.vtypeid = vtypeid;
			this.enginetypeid = enginetypeid;
			this.vtypeno = vtypeno;
			this.vtypename = vtypename;
			this.vprice = vprice;
			this.vdate = vdate;
			this.vpower = vpower;
			this.fuelmark = fuelmark;
			this.enginetypename = enginetypename;
			this.vbrandname = vbrandname;
		}

		public VehicleTypeVo() {
			super();
		}
		
		
		

		public VehicleTypeVo(Integer vbrandid, Integer enginetypeid, String vtypeno, String vtypename, Float vprice,
				Date vdate, Integer vpower, String fuelmark, String enginetypename) {
			super();
			this.vbrandid = vbrandid;
			this.enginetypeid = enginetypeid;
			this.vtypeno = vtypeno;
			this.vtypename = vtypename;
			this.vprice = vprice;
			this.vdate = vdate;
			this.vpower = vpower;
			this.fuelmark = fuelmark;
			this.enginetypename = enginetypename;
		}
		
		
	

		public VehicleTypeVo(Integer vtypeid, Integer enginetypeid, String vtypeno, String vtypename, Float vprice,
				Date vdate, Integer vpower, String fuelmark, String enginetypename, String vbrandname) {
			super();
			this.vtypeid = vtypeid;
			this.enginetypeid = enginetypeid;
			this.vtypeno = vtypeno;
			this.vtypename = vtypename;
			this.vprice = vprice;
			this.vdate = vdate;
			this.vpower = vpower;
			this.fuelmark = fuelmark;
			this.enginetypename = enginetypename;
			this.vbrandname = vbrandname;
		}

		public VehicleTypeVo(Integer vbrandid, Integer enginetypeid, String vtypeno, String vtypename,
				Float vprice, Date vdate) {
			super();
			this.vbrandid = vbrandid;
			this.enginetypeid = enginetypeid;
			this.vtypeno = vtypeno;
			this.vtypename = vtypename;
			this.vprice = vprice;
			this.vdate = vdate;
		}

		public VehicleTypeVo(Float vprice) {
			super();
			this.vprice = vprice;
		}
	    
		
	    
}
