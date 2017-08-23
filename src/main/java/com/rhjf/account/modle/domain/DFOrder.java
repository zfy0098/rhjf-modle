package com.rhjf.account.modle.domain;

import java.io.Serializable;

public class DFOrder implements Serializable{
	
	private static final long serialVersionUID = -7771899558460660121L;
	private int id;
	private String payType;  //代付类型
	private String payItemId;  //付款数据id（订单号）
	private String seqNo;  //本条数据在本批次数据编号，从1开始
	private String payAmt;  //交易金额
	private String tradeDate; //交易日期
	private String tradeTime; //交易时间
	private String tradeStatus; //交易状态 默认01 正在受理
	private String actName;  //收款人户名
	private String actNo;  //收款人卡号
	private String actType;  //收款人账户类型（00:对公，01:对私）
	private String bankCode;  //银行编码
	private String bankName;  //银行名称
	private String bankLineNo;  //银行联行号
	private String bankLineName;  //联行名称
	private String rmk;  //备注
	private String smsFlg;  //是否短信提醒（1:是，0:否）
	private String tel;  //手机号
	private String bankPayPurpose;  //银行付款用途
	private String transactionSource; //交易来源（00：交易 01：小贷）
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayItemId() {
		return payItemId;
	}
	public void setPayItemId(String payItemId) {
		this.payItemId = payItemId;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}
	public String getActName() {
		return actName;
	}
	public void setActName(String actName) {
		this.actName = actName;
	}
	public String getActNo() {
		return actNo;
	}
	public void setActNo(String actNo) {
		this.actNo = actNo;
	}
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankLineNo() {
		return bankLineNo;
	}
	public void setBankLineNo(String bankLineNo) {
		this.bankLineNo = bankLineNo;
	}
	public String getBankLineName() {
		return bankLineName;
	}
	public void setBankLineName(String bankLineName) {
		this.bankLineName = bankLineName;
	}
	public String getRmk() {
		return rmk;
	}
	public void setRmk(String rmk) {
		this.rmk = rmk;
	}
	public String getSmsFlg() {
		return smsFlg;
	}
	public void setSmsFlg(String smsFlg) {
		this.smsFlg = smsFlg;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBankPayPurpose() {
		return bankPayPurpose;
	}
	public void setBankPayPurpose(String bankPayPurpose) {
		this.bankPayPurpose = bankPayPurpose;
	}
	public String getTransactionSource() {
		return transactionSource;
	}
	public void setTransactionSource(String transactionSource) {
		this.transactionSource = transactionSource;
	}
}
