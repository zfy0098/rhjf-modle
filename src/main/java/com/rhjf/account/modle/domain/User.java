package com.rhjf.account.modle.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年7月2日 上午10:37:53
*
* @ClassName 类名称
*
* @Description 用户表
*/
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6119709137075976242L;
	
	
	private int id;
	/**
	 * 商户号
	 */
	private String merchant_no;
	/**
	 * 商户名称
	 */
	private String merchant_name;
	/**
	 * 真实姓名
	 */
	private String real_name;
	/**
	 * 提现类型
	 * 1 费率
	 * 2 固定值
	 */
	private int withdraw_type;
	/**
	 * 用户类型
	 * 1 线下 
	 * 2 线上
	 */
	private int user_type;
	/**
	 * 提现手续费费率
	 */
	private BigDecimal withdraw_user_fee;
	/**
	 * 提现手续费固定值
	 */
	private BigDecimal withdraw_fee;
	/**
	 * T0 提现手续费免征起点
	 */
	private BigDecimal exemption_start_point;
	/**
	 * 用户创建时间
	 */
	private Date create_time;
	/**
	 * 用户状态
	 */
	private int status;
	
	
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
	public String getMerchant_name() {
		return merchant_name;
	}
	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public int getWithdraw_type() {
		return withdraw_type;
	}
	public void setWithdraw_type(int withdraw_type) {
		this.withdraw_type = withdraw_type;
	}
	public BigDecimal getWithdraw_user_fee() {
		return withdraw_user_fee;
	}
	public void setWithdraw_user_fee(BigDecimal withdraw_user_fee) {
		this.withdraw_user_fee = withdraw_user_fee;
	}
	public BigDecimal getWithdraw_fee() {
		return withdraw_fee;
	}
	public void setWithdraw_fee(BigDecimal withdraw_fee) {
		this.withdraw_fee = withdraw_fee;
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
	public int getUser_type() {
		return user_type;
	}
	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
	public BigDecimal getExemption_start_point() {
		return exemption_start_point;
	}
	public void setExemption_start_point(BigDecimal exemption_start_point) {
		this.exemption_start_point = exemption_start_point;
	}
	
}
