package com.rui.architect_prototype.demo3;



/**
 * 作者: zengqinrui on 18/3/25 20:17
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */
// 具体原型类, IOrder继承了Clonable接口
public class EnterpriseOrder extends AbsOrder {

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

    // 重写clone方法，该类需要实现Clonable接口
    @Override
    protected EnterpriseOrder clone() throws CloneNotSupportedException {
        return (EnterpriseOrder)super.clone();
    }
}
