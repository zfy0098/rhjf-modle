package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;

public class SalesManADList  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 4058013938597199199L;
	private String ID;
    private String content;
    private String imgURL;
    private String ADURL;
    private String title;

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setADURL(String ADURL) {
        this.ADURL = ADURL;
    }

    public String getADURL() {
        return ADURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
