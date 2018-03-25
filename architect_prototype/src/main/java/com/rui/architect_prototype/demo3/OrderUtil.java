package com.rui.architect_prototype.demo3;



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
    public static List<AbsOrder> splitOrder(AbsOrder order) {
        ArrayList<AbsOrder> orders = new ArrayList<>();
        AbsOrder iOrder;
        try {
            while(order.getOrderNumber() > 200) {
                iOrder = order.clone();
                iOrder.setOrderNumber(200);
                order.setOrderNumber(order.getOrderNumber() - 200);
                orders.add(iOrder);
            }
            orders.add(order);
        } catch (Exception e) {

        }
        return orders;
    }


}
