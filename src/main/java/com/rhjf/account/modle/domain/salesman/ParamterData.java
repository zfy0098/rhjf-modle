package com.rhjf.account.modle.domain.salesman;

import java.io.Serializable;

/**
 *   客户端请求参数
 * @author hadoop
 *
 */
public class ParamterData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2670518416102795479L;


	/** 查询详细数据的数据ID **/
	private String ID;

	/** 用户登录账号 **/
	private String loginID;
	
	/**  用户登录密码 ***/
	private String loginPWD;

	/** 新密码 **/
	private String newLoginPWD;

	/** 发送时间 **/
	private String sendTime;

	/** 终端流水号 **/
	private String sendSeqId;

	/** 可提现余额 **/
	private String balance;

	/** 用户请求类型 **/
	private String txndir;
	
	/** 商户名称 **/
	private String merchantName;

	/** 商户所在省份 **/
	private String state;

	/** 商户所在城市  **/
	private String city;

	/** 商户所在区 **/
	private String county;

	/** 经营地址 **/
	private String address;

	/**  门牌号 **/
	private String houseNumber;

	/** 商户登录手机号 **/
	private String merchantLoginID;
	
	/** 持卡人姓名 **/
	private String name;
	
	/** 身份证号 **/
	private String IDCard;
	
	/** 银行卡号  **/
	private String bankCardNo;

	/**  银行名称 **/
	private String bankName;

	/**   卡片类型  储蓄卡或者信用卡 **/
	private String cardName;

	/**   银行英文缩写 **/
	private String bankSymbol;
	
	/** 开户行地址  **/
	private String bankAddress;
	
	/** 支行名称 **/
	private String bankSubbranch;

	/** 开户行省份 **/
	private String bankProv;

	/** 开户行城市 **/
	private String bankCity;

	/** 银行预留手机号 ***/
	private String phoneNumber;

	/** 信用卡账号 **/
	private String creditCardNo;

	/**  查询数据 时间条件 **/
	private String tradeDate;
	
	/**  用户签到签到获取秘钥  **/
	private String secretKey;

	/** 响应客户端列表数据 **/
	private String list;
	
	/** 响应状态码 **/
	private String respCode;
	
	/** 响应描述信息  **/
	private String respDesc;
	
	/** 客户端请求数据mac校验 **/
	private String mac;

	/** 登录设备信息 **/
	private String terminalInfo;

	/** 业务员获取的三级分销收益 **/
	private String distributeProfit;

	/** 获取的公司收益 **/
	private String profit;

	/** 全部收益 **/
	private String profitTotal;

	/**  显示金额  **/
	private String amount;

	/** 商户等级 0 1 2 **/
	private String merchantLevel;

	/**  * 信用卡类别（区分银行） */
	private String bankID;

	/**  申请信用卡使用 其意思未知 **/
	private String agencyNumber;

	/** 信用卡公网链接  **/
	private String bankURL;

	/** 手持身份证照片 **/
	private String handheldIDPhoto;

	/** 身份证正面照片 **/
	private String IDCardFrontPhoto;

	/** 身份证反面照片 **/
	private String IDCardReversePhoto;

	/** 银行卡照片 **/
	private String bankCardPhoto;

	/** 营业执照照片 **/
	private String businessPhoto;


	/**  我的二维码地址 **/
	private String myQRCodeURL;

	/**  固定码地址 **/
	private String QRCodeURL;


	/** 用户输入短信验证码 **/
	private String smsCode;


	/**  数据数量 **/
	private String count;


	/** 关于我们 **/
	private String aboutURL;


	/**  公司资质 **/
	private String companyAptitudeURL;


	/**  到账类型 T1 或者T0 **/
	private String tradeCode;


	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getLoginPWD() {
		return loginPWD;
	}

	public void setLoginPWD(String loginPWD) {
		this.loginPWD = loginPWD;
	}

	public String getTxndir() {
		return txndir;
	}

	public void setTxndir(String txndir) {
		this.txndir = txndir;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMerchantLoginID() {
		return merchantLoginID;
	}

	public void setMerchantLoginID(String merchantLoginID) {
		this.merchantLoginID = merchantLoginID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankSubbranch() {
		return bankSubbranch;
	}

	public void setBankSubbranch(String bankSubbranch) {
		this.bankSubbranch = bankSubbranch;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setList(String list) {
		this.list = list;
	}

	public String getList() {
		return list;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getBalance() {
		return balance;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getTerminalInfo() {
		return terminalInfo;
	}

	public void setTerminalInfo(String terminalInfo) {
		this.terminalInfo = terminalInfo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getDistributeProfit() {
		return distributeProfit;
	}

	public void setDistributeProfit(String distributeProfit) {
		this.distributeProfit = distributeProfit;
	}

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

	public String getProfitTotal() {
		return profitTotal;
	}

	public void setProfitTotal(String profitTotal) {
		this.profitTotal = profitTotal;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getMerchantLevel() {
		return merchantLevel;
	}

	public void setMerchantLevel(String merchantLevel) {
		this.merchantLevel = merchantLevel;
	}


	public void setBankID(String bankID) {
		this.bankID = bankID;
	}

	public String getBankID() {
		return bankID;
	}

	public void setAgencyNumber(String agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	public String getAgencyNumber() {
		return agencyNumber;
	}


	public void setBankURL(String bankURL) {
		this.bankURL = bankURL;
	}

	public String getBankURL() {
		return bankURL;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getBankCity() {
		return bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankProv() {
		return bankProv;
	}

	public void setBankProv(String bankProv) {
		this.bankProv = bankProv;
	}

	public String getHandheldIDPhoto() {
		return handheldIDPhoto;
	}

	public void setHandheldIDPhoto(String handheldIDPhoto) {
		this.handheldIDPhoto = handheldIDPhoto;
	}

	public String getIDCardFrontPhoto() {
		return IDCardFrontPhoto;
	}

	public void setIDCardFrontPhoto(String IDCardFrontPhoto) {
		this.IDCardFrontPhoto = IDCardFrontPhoto;
	}

	public String getIDCardReversePhoto() {
		return IDCardReversePhoto;
	}

	public void setIDCardReversePhoto(String IDCardReversePhoto) {
		this.IDCardReversePhoto = IDCardReversePhoto;
	}

	public String getBankCardPhoto() {
		return bankCardPhoto;
	}

	public void setBankCardPhoto(String bankCardPhoto) {
		this.bankCardPhoto = bankCardPhoto;
	}

	public String getBusinessPhoto() {
		return businessPhoto;
	}

	public void setBusinessPhoto(String businessPhoto) {
		this.businessPhoto = businessPhoto;
	}

	public String getNewLoginPWD() {
		return newLoginPWD;
	}

	public void setNewLoginPWD(String newLoginPWD) {
		this.newLoginPWD = newLoginPWD;
	}

	public String getMyQRCodeURL() {
		return myQRCodeURL;
	}

	public void setMyQRCodeURL(String myQRCodeURL) {
		this.myQRCodeURL = myQRCodeURL;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getSendSeqId() {
		return sendSeqId;
	}

	public void setSendSeqId(String sendSeqId) {
		this.sendSeqId = sendSeqId;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getBankSymbol() {
		return this.bankSymbol;
	}

	public void setBankSymbol(String bankSymbol) {
		this.bankSymbol = bankSymbol;
	}

	public String getAboutURL() {
		return this.aboutURL;
	}

	public void setAboutURL(String aboutURL) {
		this.aboutURL = aboutURL;
	}

	public String getCompanyAptitudeURL() {
		return this.companyAptitudeURL;
	}

	public void setCompanyAptitudeURL(String companyAptitudeURL) {
		this.companyAptitudeURL = companyAptitudeURL;
	}

	public String getTradeCode() {
		return this.tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getQRCodeURL() {
		return this.QRCodeURL;
	}

	public void setQRCodeURL(String QRCodeURL) {
		this.QRCodeURL = QRCodeURL;
	}
}
