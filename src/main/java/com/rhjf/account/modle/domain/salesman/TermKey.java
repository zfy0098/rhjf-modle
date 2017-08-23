package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;

public class TermKey implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7288224442591349750L;
	
	
	
	private String ID;
	private String userID;
	private String macKey;
	private String pinKey;
	private String tDKey;
	private String tmkKey;
	private String termTmkKey;

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserID() {
		return userID;
	}

	public void setMacKey(String macKey) {
		this.macKey = macKey;
	}

	public String getMacKey() {
		return macKey;
	}

	public void setPinKey(String pinKey) {
		this.pinKey = pinKey;
	}

	public String getPinKey() {
		return pinKey;
	}

	public void setTDKey(String tDKey) {
		this.tDKey = tDKey;
	}

	public String getTDKey() {
		return tDKey;
	}

	public void setTmkKey(String tmkKey) {
		this.tmkKey = tmkKey;
	}

	public String getTmkKey() {
		return tmkKey;
	}

	public void setTermTmkKey(String termTmkKey) {
		this.termTmkKey = termTmkKey;
	}

	public String getTermTmkKey() {
		return termTmkKey;
	}
}
