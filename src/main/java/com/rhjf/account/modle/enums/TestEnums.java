package com.rhjf.account.modle.enums;

/**
* @author zzg
*
* @version 1.0
*
* 创建时间：2017年6月27日 下午6:45:15
*
* @ClassName 类名称
*
* @Description 类描述
*/
public enum TestEnums {
	
    TEST("TEST", 0);

    // 成员变量
    private String name;
    private int index;

    // 构造方法
    private TestEnums(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (TestEnums c : TestEnums.values()) {
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
