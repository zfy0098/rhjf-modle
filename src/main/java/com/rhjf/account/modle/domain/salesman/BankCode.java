package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;

public class BankCode implements Serializable{
    private int ID;
    private String bankName;
    private String bankSymbol;
    private String bankBranch;
    private String bankCode;
    private String bankProv;
    private String bankCity;

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankSymbol(String bankSymbol) {
        this.bankSymbol = bankSymbol;
    }

    public String getBankSymbol() {
        return bankSymbol;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCode() {
        return bankCode;
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
}
