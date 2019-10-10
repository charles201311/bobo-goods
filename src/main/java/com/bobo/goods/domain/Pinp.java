package com.bobo.goods.domain;

/**
 * @作者 王清锋
 * 2019年10月9日
 * 
 */
public class Pinp {
	private Integer pid;
	private String pname;
	public Pinp() {
		super();
	}
	public Pinp(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Pinp [pid=" + pid + ", pname=" + pname + "]";
	}
	
}
