package com.vikash.web.model;

public class Alien {
	private int uid;
	private String uname;
	private String pass;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Alien [uid=" + uid + ", uname=" + uname + ", pass=" + pass + "]";
	}

}
