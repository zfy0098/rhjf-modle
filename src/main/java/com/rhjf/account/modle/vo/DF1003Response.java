package com.rhjf.account.modle.vo;

import java.util.List;

public class DF1003Response {
	
	private static final long serialVersionUID = -3428045775596802013L;

	private String successNum;
	
	private String failureNum;
	
	private List<PayResultList> payResultList;
	
	public static class PayResultList {
		
		private String payItemId;
		
		private String resCd;
		
		private String resMsg;
		
		public String getPayItemId() {
			return payItemId;
		}
		public void setPayItemId(String payItemId) {
			this.payItemId = payItemId;
		}
		public String getResCd() {
			return resCd;
		}
		public void setResCd(String resCd) {
			this.resCd = resCd;
		}
		public String getResMsg() {
			return resMsg;
		}
		public void setResMsg(String resMsg) {
			this.resMsg = resMsg;
		}
		
	}

	public String getSuccessNum() {
		return successNum;
	}

	public void setSuccessNum(String successNum) {
		this.successNum = successNum;
	}

	public String getFailureNum() {
		return failureNum;
	}

	public void setFailureNum(String failureNum) {
		this.failureNum = failureNum;
	}

	public List<PayResultList> getPayResultList() {
		return payResultList;
	}

	public void setPayResultList(List<PayResultList> payResultList) {
		this.payResultList = payResultList;
	}
	
	
}
