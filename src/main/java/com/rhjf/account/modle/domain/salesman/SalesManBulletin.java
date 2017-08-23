package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;
import java.util.Date;

public class SalesManBulletin implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -5757980352786830402L;
	private String ID;
    private String agentID;
    private String bulletinTitle;
    private String bulletinContent;
    private Date bulletinDateTime;
    private int bulletinStatus;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setBulletinTitle(String bulletinTitle) {
        this.bulletinTitle = bulletinTitle;
    }

    public String getBulletinTitle() {
        return bulletinTitle;
    }

    public void setBulletinContent(String bulletinContent) {
        this.bulletinContent = bulletinContent;
    }

    public String getBulletinContent() {
        return bulletinContent;
    }

    public void setBulletinDateTime(Date bulletinDateTime) {
        this.bulletinDateTime = bulletinDateTime;
    }

    public Date getBulletinDateTime() {
        return bulletinDateTime;
    }

    public void setBulletinStatus(int bulletinStatus) {
        this.bulletinStatus = bulletinStatus;
    }

    public int getBulletinStatus() {
        return bulletinStatus;
    }
}
