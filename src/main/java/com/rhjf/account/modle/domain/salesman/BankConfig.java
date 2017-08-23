package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;

public class BankConfig implements Serializable{
    private String ID;
    private String bankName;
    private String bankUrl;
    private int bankStatus;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankUrl(String bankUrl) {
        this.bankUrl = bankUrl;
    }

    public String getBankUrl() {
        return bankUrl;
    }

    public void setBankStatus(int bankStatus) {
        this.bankStatus = bankStatus;
    }

    public int getBankStatus() {
        return bankStatus;
    }
}
