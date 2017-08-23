package com.rhjf.account.modle.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月29日 下午2:39:13
*
* @ClassName 类名称
*
* @Description 商户信息
*/
public class MerchantInfoVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3380297644453982986L;
	
	private String merchant_no;
	
	private String merchant_withdraw_type;
	
	private Double merchant_drawing_fee_rate;
	
	private BigDecimal merchant_drawing_fee;
	
	private BigDecimal exemption_start_point;

	public String getMerchant_no() {
		return merchant_no;
	}

	public void setMerchant_no(String merchant_no) {
		this.merchant_no = merchant_no;
	}

	public String getMerchant_withdraw_type() {
		return merchant_withdraw_type;
	}

	public void setMerchant_withdraw_type(String merchant_withdraw_type) {
		this.merchant_withdraw_type = merchant_withdraw_type;
	}

	public Double getMerchant_drawing_fee_rate() {
		return merchant_drawing_fee_rate;
	}

	public void setMerchant_drawing_fee_rate(Double merchant_drawing_fee_rate) {
		this.merchant_drawing_fee_rate = merchant_drawing_fee_rate;
	}

	public BigDecimal getMerchant_drawing_fee() {
		return merchant_drawing_fee;
	}

	public void setMerchant_drawing_fee(BigDecimal merchant_drawing_fee) {
		this.merchant_drawing_fee = merchant_drawing_fee;
	}

	public BigDecimal getExemption_start_point() {
		return exemption_start_point;
	}

	public void setExemption_start_point(BigDecimal exemption_start_point) {
		this.exemption_start_point = exemption_start_point;
	}
	
}
