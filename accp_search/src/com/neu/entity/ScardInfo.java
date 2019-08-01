package com.neu.entity;

import java.util.Date;

public class ScardInfo {
	private Integer sid;
	private String sname;
	private String idcard;
	private Double scard;
	private Date sdate;
	private String stype;
	public ScardInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScardInfo(Integer sid, String sname, String idcard, Double scard, Date sdate, String stype) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.idcard = idcard;
		this.scard = scard;
		this.sdate = sdate;
		this.stype = stype;
	}
	@Override
	public String toString() {
		return "ScardInfo [sid=" + sid + ", sname=" + sname + ", idcard=" + idcard + ", scard=" + scard + ", sdate="
				+ sdate + ", stype=" + stype + "]";
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Double getScard() {
		return scard;
	}
	public void setScard(Double scard) {
		this.scard = scard;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	
}
