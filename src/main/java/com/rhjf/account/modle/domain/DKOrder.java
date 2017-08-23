package com.rhjf.account.modle.domain;

import java.io.Serializable;

public class DKOrder implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String amount; //扣款金额
	
	private String orderNo; //订单号
	
	private String tradeDate; //交易日期
	
	private String tradeTime; //交易时间
	
	private String tradeStatus; //交易状态
	
	private String ccy; //币种
	
	private String name; //扣款人姓名
	
	private String idNo; //扣款人身份证号
	
	private String accountNo; //扣款人卡号
	
	private String phone; //扣款人手机号
	
	private String bankName; //银行名称（编码）
	
	private String accountProv; //扣款人卡号所在省（代码）
	
	private String accountCity; //扣款人卡号所在市（代码）
	
	private String withholdingUse; //短信提醒内容
	
	private String productName; //商品名称
	
	private String productNum; //商品数量
	
	private String protocolNo; //协议编号
	
	private String notifyUrl; //异步地址

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public String getTradeStatus() {
		return tradeStatus;
	}

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountProv() {
		return accountProv;
	}

	public void setAccountProv(String accountProv) {
		this.accountProv = accountProv;
	}

	public String getAccountCity() {
		return accountCity;
	}

	public void setAccountCity(String accountCity) {
		this.accountCity = accountCity;
	}

	public String getWithholdingUse() {
		return withholdingUse;
	}

	public void setWithholdingUse(String withholdingUse) {
		this.withholdingUse = withholdingUse;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public String getProtocolNo() {
		return protocolNo;
	}

	public void setProtocolNo(String portocolNo) {
		this.protocolNo = portocolNo;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
}
