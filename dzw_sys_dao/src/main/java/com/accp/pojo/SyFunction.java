package com.accp.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class SyFunction {
    private Integer syfunctionid;

    private String syfunctionname;

    private String syfunctioncode;

    private Integer uplv;
    
    private String sypage;
    
    public String getSypage() {
		return sypage;
	}

	public void setSypage(String sypage) {
		this.sypage = sypage;
	}

	@JSONField(format = "yyyy-MM-dd")
    private Date createdate;
    
    private SyFunction parentSyfun;


	public SyFunction() {
		super();
	}

	

	public SyFunction(Integer syfunctionid, String syfunctionname, String syfunctioncode, Integer uplv, String sypage,
			Date createdate, SyFunction parentSyfun) {
		super();
		this.syfunctionid = syfunctionid;
		this.syfunctionname = syfunctionname;
		this.syfunctioncode = syfunctioncode;
		this.uplv = uplv;
		this.sypage = sypage;
		this.createdate = createdate;
		this.parentSyfun = parentSyfun;
	}

	public SyFunction getParentSyfun() {
		return parentSyfun;
	}

	public void setParentSyfun(SyFunction parentSyfun) {
		this.parentSyfun = parentSyfun;
	}

	public Integer getSyfunctionid() {
        return syfunctionid;
    }

    public void setSyfunctionid(Integer syfunctionid) {
        this.syfunctionid = syfunctionid;
    }

    public String getSyfunctionname() {
        return syfunctionname;
    }

    public void setSyfunctionname(String syfunctionname) {
        this.syfunctionname = syfunctionname == null ? null : syfunctionname.trim();
    }

    public String getSyfunctioncode() {
        return syfunctioncode;
    }

    public void setSyfunctioncode(String syfunctioncode) {
        this.syfunctioncode = syfunctioncode == null ? null : syfunctioncode.trim();
    }

    public Integer getUplv() {
        return uplv;
    }

    public void setUplv(Integer uplv) {
        this.uplv = uplv;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}