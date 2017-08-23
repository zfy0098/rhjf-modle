package com.rhjf.account.modle.domain;

import java.io.Serializable;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年7月2日 上午11:08:09
*
* @ClassName 类名称
*
* @Description 用户结算卡信息
*/
public class UserBankInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5443089658430033872L;
	
	
	private int id;
	/**
	 * 用户ID
	 */
	private int user_id;
	/**
	 * 用户结算卡身份证号
	 */
	private String id_card_number;
	/**
	 * 开户名
	 */
	private String acc_name;
	/**
	 * 开户行
	 */
	private String open_bank;
	/**
	 * 开户行支行
	 */
	private String bank_branch;
	/**
	 * 结算卡 卡号
	 */
	private String bank_card_number;
	/**
	 * 联行号
	 */
	private String bank_code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getId_card_number() {
		return id_card_number;
	}
	public void setId_card_number(String id_card_number) {
		this.id_card_number = id_card_number;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getOpen_bank() {
		return open_bank;
	}
	public void setOpen_bank(String open_bank) {
		this.open_bank = open_bank;
	}
	public String getBank_branch() {
		return bank_branch;
	}
	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}
	public String getBank_card_number() {
		return bank_card_number;
	}
	public void setBank_card_number(String bank_card_number) {
		this.bank_card_number = bank_card_number;
	}
	public String getBank_code() {
		return bank_code;
	}
	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

}
