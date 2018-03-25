package com.rui.architect_prototype.demo1;

/**
 * 作者: zengqinrui on 18/3/25 20:17
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class EnterpriseOrder implements IOrder {

    private String orderName;
    private int orderNumber;

    @Override
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public String getOrderName() {
        return orderName;
    }


}
