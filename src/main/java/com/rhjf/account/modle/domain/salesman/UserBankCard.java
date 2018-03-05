package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;


/**
 * 
 * 
 *   商户结算卡信息
 * @author hadoop
 *
 */
public class UserBankCard implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 426828729422399788L;
	
	private String ID;
	private String userID;
	private String accountName;
	private String accountNo;
	private String bankBranch;
	private String bankProv;
	private String bankCity;
	private String bankCode;
	private String bankName;
	private String settleCreditCard;
	private String settleBankType;
	private String payerPhone;



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

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankProv(String bankProv) {
		this.bankProv = bankProv;
	}

	public String getBankProv() {
		return bankProv;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setSettleCreditCard(String settleCreditCard) {
		this.settleCreditCard = settleCreditCard;
	}

	public String getSettleCreditCard() {
		return settleCreditCard;
	}

	public void setSettleBankType(String settleBankType) {
		this.settleBankType = settleBankType;
	}

	public String getSettleBankType() {
		return settleBankType;
	}

	public String getPayerPhone() {
		return payerPhone;
	}

	public void setPayerPhone(String payerPhone) {
		this.payerPhone = payerPhone;
	}
}
