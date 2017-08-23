package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;
import java.util.Date;

public class Salesman implements Serializable{




    /**
	 * 
	 */
	private static final long serialVersionUID = 6716706925252757170L;
	private String ID;
    private String agentID;
    private String salesName;
    private String salesCardID;
    private String bankName;
    private String accountNo;
    private String cardName;
    private String phoneNumber;
    private double feeRate;
    private double t0FeeRate;
    private int salesStatus;
    private Date registerDate;
    private String bankSybol;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesCardID(String salesCardID) {
        this.salesCardID = salesCardID;
    }

    public String getSalesCardID() {
        return salesCardID;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFeeRate(double feeRate) {
        this.feeRate = feeRate;
    }

    public double getFeeRate() {
        return feeRate;
    }

    public void setT0FeeRate(double t0FeeRate) {
        this.t0FeeRate = t0FeeRate;
    }

    public double getT0FeeRate() {
        return t0FeeRate;
    }

    public void setSalesStatus(int salesStatus) {
        this.salesStatus = salesStatus;
    }

    public int getSalesStatus() {
        return salesStatus;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getAgentID() {
        return agentID;
    }

    public Date getRegisterDate() {
        return this.registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getBankSybol() {
        return this.bankSybol;
    }

    public void setBankSybol(String bankSybol) {
        this.bankSybol = bankSybol;
    }
}
