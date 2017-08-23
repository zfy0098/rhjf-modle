package com.rhjf.account.modle.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月27日 下午6:45:22
*
* @ClassName 类名称
*
* @Description 类描述
*/
public class TestVo implements Serializable {
	

    /**
	 * 
	 */
	private static final long serialVersionUID = -3428045775596802013L;

	private String unite_bank_no;
    
    private String bank_name;
    
    private BigDecimal boost;

	public String getUnite_bank_no() {
		return unite_bank_no;
	}

	public void setUnite_bank_no(String unite_bank_no) {
		this.unite_bank_no = unite_bank_no;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public BigDecimal getBoost() {
		return boost;
	}

	public void setBoost(BigDecimal boost) {
		this.boost = boost;
	}
    
}
