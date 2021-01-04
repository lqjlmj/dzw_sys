package com.accp.pojo;

public class StaffAttribute {
    private Integer staffaeid;

    private String staffaename;

    public Integer getStaffaeid() {
        return staffaeid;
    }

    public void setStaffaeid(Integer staffaeid) {
        this.staffaeid = staffaeid;
    }

    public String getStaffaename() {
        return staffaename;
    }

    public void setStaffaename(String staffaename) {
        this.staffaename = staffaename == null ? null : staffaename.trim();
    }
}