package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;

/**
 *    商户费率配置信息
 */

public class UserConfig implements Serializable{

    private String ID;
    private String userID;
    private int payChannel;
    private String saleAmountMax;
    private String saleAmountMaxDay;
    private double t1SaleRate;
    private double t0SaleRate;
    private double t1SettlementRate;
    private double t0SettlementRate;

    public void setID(String iD) {
        this.ID = iD;
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

    public void setPayChannel(int payChannel) {
        this.payChannel = payChannel;
    }

    public int getPayChannel() {
        return payChannel;
    }

    public void setSaleAmountMax(String saleAmountMax) {
        this.saleAmountMax = saleAmountMax;
    }

    public String getSaleAmountMax() {
        return saleAmountMax;
    }

    public void setSaleAmountMaxDay(String saleAmountMaxDay) {
        this.saleAmountMaxDay = saleAmountMaxDay;
    }

    public String getSaleAmountMaxDay() {
        return saleAmountMaxDay;
    }

    public void setT1SaleRate(double t1SaleRate) {
        this.t1SaleRate = t1SaleRate;
    }

    public double getT1SaleRate() {
        return t1SaleRate;
    }

    public void setT0SaleRate(double t0SaleRate) {
        this.t0SaleRate = t0SaleRate;
    }

    public double getT0SaleRate() {
        return t0SaleRate;
    }

    public void setT1SettlementRate(double t1SettlementRate) {
        this.t1SettlementRate = t1SettlementRate;
    }

    public double getT1SettlementRate() {
        return t1SettlementRate;
    }

    public void setT0SettlementRate(double t0SettlementRate) {
        this.t0SettlementRate = t0SettlementRate;
    }

    public double getT0SettlementRate() {
        return t0SettlementRate;
    }
}
