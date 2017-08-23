package com.rhjf.account.modle.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月28日 上午8:45:24
*
* @ClassName 类名称
*
* @Description 子账户表
*/
public class AccountRecordDomain implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8503238916138892669L;

	private int id;
	
	/**
	 * 主账户表ID
	 */
	private int account_id;
	/**
	 * 下游流水号
	 */
	private String serial_number;
	/**
	 * 平台流水号
	 */
	private String req_sn;
	/**
	 * 对主账户余额操作类型
	 */
	private int type;
	/**
	 * 创建时间
	 */
	private Date create_time;
	/**
	 * 状态
	 */
	private int status;
	/**
	 * 金额
	 */
	private BigDecimal amount;
	
	
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	public String getReq_sn() {
		return req_sn;
	}
	public void setReq_sn(String req_sn) {
		this.req_sn = req_sn;
	}
	
}
