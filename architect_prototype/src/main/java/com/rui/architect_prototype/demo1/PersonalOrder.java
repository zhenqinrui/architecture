package com.rui.architect_prototype.demo1;

/**
 * 作者: zengqinrui on 18/3/25 20:16
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class PersonalOrder implements IOrder {

    private int orderNumber;
    private String orderName;

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

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "orderNumber=" + orderNumber +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
