package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;
import java.util.Date;

public class PayMerchant implements Serializable{

    private String merchantID;
    private String merchantName;
    private Date userTime;
    private String signKey;
    private String dESKey;
    private String queryKey;
    private String userID;
    private String payType;
    private String alipaySignKey;

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setUserTime(Date userTime) {
        this.userTime = userTime;
    }

    public Date getUserTime() {
        return userTime;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public String getSignKey() {
        return signKey;
    }

    public void setDESKey(String dESKey) {
        this.dESKey = dESKey;
    }

    public String getDESKey() {
        return dESKey;
    }

    public void setQueryKey(String queryKey) {
        this.queryKey = queryKey;
    }

    public String getQueryKey() {
        return queryKey;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return payType;
    }

    public void setAlipaySignKey(String alipaySignKey) {
        this.alipaySignKey = alipaySignKey;
    }

    public String getAlipaySignKey() {
        return alipaySignKey;
    }
}
