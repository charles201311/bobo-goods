package com.bobo.goods.domain;

/**
 * @作者 王清锋
 * 2019年10月9日
 * 
 */
public class Goods {
	private Integer gid;
	private String gname;
	private String gename;
	private Double gsize;
	private Integer price;
	private Integer num;
	private String bq;
	private Integer zhuangt;
	private Type type;
	private Pinp pinp;
	
	private String url;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Goods() {
		super();
	}
	public Goods(Integer gid, String gname, String gename, Double gsize, Integer price, Integer num, String bq,
			Integer zhuangt, Type type, Pinp pinp) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gename = gename;
		this.gsize = gsize;
		this.price = price;
		this.num = num;
		this.bq = bq;
		this.zhuangt = zhuangt;
		this.type = type;
		this.pinp = pinp;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGename() {
		return gename;
	}
	public void setGename(String gename) {
		this.gename = gename;
	}
	public Double getGsize() {
		return gsize;
	}
	public void setGsize(Double gsize) {
		this.gsize = gsize;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public Integer getZhuangt() {
		return zhuangt;
	}
	public void setZhuangt(Integer zhuangt) {
		this.zhuangt = zhuangt;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Pinp getPinp() {
		return pinp;
	}
	public void setPinp(Pinp pinp) {
		this.pinp = pinp;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gename=" + gename + ", gsize=" + gsize + ", price=" + price
				+ ", num=" + num + ", bq=" + bq + ", zhuangt=" + zhuangt + ", type=" + type + ", pinp=" + pinp + "]";
	}
	

}
