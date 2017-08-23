package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;

/**
 * Created by hadoop on 2017/8/9.
 */
public class PayChannel implements Serializable{


    private Integer ID;
    private String payChannelName;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPayChannelName() {
        return payChannelName;
    }

    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName;
    }
}
