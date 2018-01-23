package com.example.demo.dto;

public class User {
	private Integer uid;
	private String uname;
	private String username;
	private String password;
	private Integer did;
	private String dname;
	private String zt;
	private String time;
	private String bhy;
	private String bqy;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBhy() {
		return bhy;
	}
	public void setBhy(String bhy) {
		this.bhy = bhy;
	}
	public String getBqy() {
		return bqy;
	}
	public void setBqy(String bqy) {
		this.bqy = bqy;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", username=" + username + ", password=" + password + ", did="
				+ did + ", dname=" + dname + ", zt=" + zt + ", time=" + time + ", bhy=" + bhy + ", bqy=" + bqy + "]";
	}
	public User(Integer uid, String uname, String username, String password, Integer did, String dname, String zt,
			String time, String bhy, String bqy) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.username = username;
		this.password = password;
		this.did = did;
		this.dname = dname;
		this.zt = zt;
		this.time = time;
		this.bhy = bhy;
		this.bqy = bqy;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
