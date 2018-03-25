package com.rui.architect_prototype.demo3;

import com.rui.architect_prototype.demo2.IOrderCloneable;

/**
 * 作者: zengqinrui on 18/3/25 20:15
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */
// 继承系统的Clonable,具体子类再去实现Object的clone方法
public interface IOrder extends Cloneable{

    void setOrderNumber(int orderNumber);

    int getOrderNumber();

    void setOrderName(String orderName);

    String getOrderName();


}
