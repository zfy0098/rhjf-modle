package com.rhjf.account.modle.domain.salesman;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by hadoop on 2017/8/18.
 */
public class UserProperties  implements Serializable{


    private String ID;
    private String userID;
    private Date merchantLevelDate;


    public String getID() {
        return this.ID;
    }

    public String getUserID() {
        return this.userID;
    }

    public Date getMerchantLevelDate() {
        return this.merchantLevelDate;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setMerchantLevelDate(Date merchantLevelDate) {
        this.merchantLevelDate = merchantLevelDate;
    }
}
