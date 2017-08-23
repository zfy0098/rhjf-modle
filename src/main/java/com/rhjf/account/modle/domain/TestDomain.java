package com.rhjf.account.modle.domain;

import java.io.Serializable;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月27日 下午6:45:09
*
* @ClassName 类名称
*
* @Description 类描述
*/
public class TestDomain implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 6686673124188961317L;

	private int id;
    
    private String code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

    



}
