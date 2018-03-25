package com.rui.architect_prototype.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者: zengqinrui on 18/3/25 20:18
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class OrderUtil {

    /**
     * 每个订单超过200个数量的拆分为多个订单
     * @param order
     * @return
     */
    public static List<IOrder> splitOrder(IOrder order) {
        ArrayList<IOrder> orders = new ArrayList<>();
        IOrder iOrder = null;
        while(order.getOrderNumber() > 200) {
            // 以下if else 里面的代码会不会感觉很类似，麻烦？
            // 主要是创建对象与原始对象相关的属性值一致，因此可以考虑原型克隆模式
            if (order instanceof PersonalOrder) {
                PersonalOrder personalOrder = (PersonalOrder)order;
                iOrder = new PersonalOrder();
                iOrder.setOrderName(personalOrder.getOrderName());
            } else if (order instanceof EnterpriseOrder) {
                EnterpriseOrder enterpriseOrder = (EnterpriseOrder)order;
                iOrder = new EnterpriseOrder();
                iOrder.setOrderName(enterpriseOrder.getOrderName());
            }
            if (iOrder != null) {
                iOrder.setOrderNumber(200);
                order.setOrderNumber(order.getOrderNumber() - 200);
            }
            orders.add(iOrder);
        }
        orders.add(order);
        return orders;
    }


}
