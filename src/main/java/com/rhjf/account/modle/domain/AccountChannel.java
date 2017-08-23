package com.rhjf.account.modle.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月30日 上午8:55:03
*
* @ClassName 类名称
*
* @Description 用户账户中各个通道的余额
*/
public class AccountChannel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5018611651158925174L;
	
	private int id;
	
	private int account_id;
	
	private String channel_id;
	
	private BigDecimal amount;
	
	private Date update_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	

}
