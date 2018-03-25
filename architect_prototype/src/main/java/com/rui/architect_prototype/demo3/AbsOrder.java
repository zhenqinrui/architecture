package com.rui.architect_prototype.demo3;

/**
 * 作者: zengqinrui on 18/3/25 21:49
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public abstract class AbsOrder implements IOrder {

    @Override
    protected AbsOrder clone() throws CloneNotSupportedException {
        // 默认都是浅度克隆
        return (AbsOrder)super.clone();
    }
}
