package com.rhjf.account.modle.enums;
/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月29日 下午2:58:38
*
* @ClassName 类名称
*
* @Description 类描述
*/
public enum MerchantWithDrawType {
	
	RATE("费率","1"),
	FIXED("固定值","2");

    // 成员变量
    private String name;
    private String index;

    // 构造方法
    private MerchantWithDrawType(String name, String index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(String index) {
        for (MerchantWithDrawType c : MerchantWithDrawType.values()) {
            if (c.getIndex().equals(index)) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
