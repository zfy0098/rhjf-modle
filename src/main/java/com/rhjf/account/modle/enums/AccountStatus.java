package com.rhjf.account.modle.enums;
/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月28日 上午9:04:17
*
* @ClassName 类名称
*
* @Description 账户状态枚举  0不可用 1可用  2账户冻结（资金冻结）
*/
public enum AccountStatus {
	AVAILABLE("可用", 1),
	UNAVILABLE("不可用",0),
	FROZEN("冻结",2);

    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private AccountStatus(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (AccountStatus c : AccountStatus.values()) {
            if (c.getIndex() == index) {
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
