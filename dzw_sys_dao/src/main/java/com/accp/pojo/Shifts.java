package com.accp.pojo;

public class Shifts {
    private Integer shifstid;

    private String shiftsname;

    public Integer getShifstid() {
        return shifstid;
    }

    public void setShifstid(Integer shifstid) {
        this.shifstid = shifstid;
    }

    public String getShiftsname() {
        return shiftsname;
    }

    public void setShiftsname(String shiftsname) {
        this.shiftsname = shiftsname == null ? null : shiftsname.trim();
    }
}