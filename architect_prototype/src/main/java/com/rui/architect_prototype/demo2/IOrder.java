package com.rui.architect_prototype.demo2;

/**
 * 作者: zengqinrui on 18/3/25 20:15
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public interface IOrder extends IOrderCloneable{

    void setOrderNumber(int orderNumber);

    int getOrderNumber();

    void setOrderName(String orderName);

    String getOrderName();

}
