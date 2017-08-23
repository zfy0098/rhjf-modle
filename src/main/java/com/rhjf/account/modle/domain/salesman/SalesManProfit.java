package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;
import java.util.Date;

public class SalesManProfit implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5036957033922496794L;
	private String ID;
    private String salesManID;
    private String tradeID;
    private String distributeProfit;
    private String profit;
    private Date tradeDate;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setSalesManID(String salesManID) {
        this.salesManID = salesManID;
    }

    public String getSalesManID() {
        return salesManID;
    }

    public void setTradeID(String tradeID) {
        this.tradeID = tradeID;
    }

    public String getTradeID() {
        return tradeID;
    }

    public void setDistributeProfit(String distributeProfit) {
        this.distributeProfit = distributeProfit;
    }

    public String getDistributeProfit() {
        return distributeProfit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getProfit() {
        return profit;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Date getTradeDate() {
        return tradeDate;
    }
}
