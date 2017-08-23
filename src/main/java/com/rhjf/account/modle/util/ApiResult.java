package com.rhjf.account.modle.util;

import java.io.Serializable;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月28日 上午11:48:23
*
* @ClassName 类名称
*
* @Description 接口返回通用类
*/
public class ApiResult<T> implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 2048411795901031621L;

	private String respCode = "0000";//默认正常

    private String respMsg = "success";

    private T result;

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
}
