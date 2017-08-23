package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;

public class YMFQRCode implements Serializable{
    private String ID;
    private String code;
    private String userID;
    private String valid;
    private String payChannel;
    private String binded;
    private String agentID;
    private String tradeCode;
    private double rate;
    private String genDate;
    private String bindedDate;
    private String agentProfit;
    private double settlementRate;

    public void setID(String iD) {
        this.ID = iD;
    }

    public String getID() {
        return ID;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getValid() {
        return valid;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setBinded(String binded) {
        this.binded = binded;
    }

    public String getBinded() {
        return binded;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setGenDate(String genDate) {
        this.genDate = genDate;
    }

    public String getGenDate() {
        return genDate;
    }

    public void setBindedDate(String bindedDate) {
        this.bindedDate = bindedDate;
    }

    public String getBindedDate() {
        return bindedDate;
    }

    public void setAgentProfit(String agentProfit) {
        this.agentProfit = agentProfit;
    }

    public String getAgentProfit() {
        return agentProfit;
    }

    public void setSettlementRate(double settlementRate) {
        this.settlementRate = settlementRate;
    }

    public double getSettlementRate() {
        return settlementRate;
    }
}
