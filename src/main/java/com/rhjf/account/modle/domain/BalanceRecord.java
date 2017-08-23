package com.rhjf.account.modle.domain;

import java.io.Serializable;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月29日 下午1:56:33
*
* @ClassName 类名称
*
* @Description 用户查询账户余额记录表
*/
public class BalanceRecord implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2710926926936050214L;
	
	private int id;
	/**
	 * 下游查询流水号
	 */
	private String serial_number;
	/**
	 * 平台流水号
	 */
	private String req_sn;
	/**
	 * 商户编号
	 */
	private String merchant_no;
	/**
	 * 查询日期
	 */
	private String txn_date;
	/**
	 * 查询时间
	 */
	private String  txn_time;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMerchant_no() {
		return merchant_no;
	}
	public void setMerchant_no(String merchant_no) {
		this.merchant_no = merchant_no;
	}
	public String getTxn_date() {
		return txn_date;
	}
	public void setTxn_date(String txn_date) {
		this.txn_date = txn_date;
	}
	public String getTxn_time() {
		return txn_time;
	}
	public void setTxn_time(String txn_time) {
		this.txn_time = txn_time;
	}

}
