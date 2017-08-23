package com.rhjf.account.modle.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月28日 上午8:40:43
*
* @ClassName 类名称
*
* @Description 账户功能主表
*/
public class AccountDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7801965495052081441L;
	
	
	private int id;
	/**
	 * 用户ID 
	 */
	private int user_id;
	/**
	 * 支付系统商户号
	 */
	private String merchant_no;
	/**
	 * 账户余额
	 */
	private BigDecimal amount;
	/**
	 * 账户状态
	 */
	private int status;
	/**
	 * 修改时间
	 * 每次修改必须更新
	 */
	private Date update_time;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMerchant_no() {
		return merchant_no;
	}

	public void setMerchant_no(String merchant_no) {
		this.merchant_no = merchant_no;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
