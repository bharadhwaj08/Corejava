package com.siiet.constructor;

public class Customer {
	private String cname;
	private int cid;
	private String caddress;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cname, int cid, String caddress) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.caddress = caddress;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", caddress=" + caddress + "]";
	}
	

}
