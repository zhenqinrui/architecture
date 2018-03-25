package com.rui.architect_prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.rui.architect_prototype.demo2.IOrder;
import com.rui.architect_prototype.demo2.OrderUtil;
import com.rui.architect_prototype.demo2.PersonalOrder;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        IOrder order = new PersonalOrder();
//        order.setOrderName("iphone7");
//        order.setOrderNumber(600);
//        List<IOrder> orderList = OrderUtil.splitOrder(order);
//        if (orderList != null) {
//            for (IOrder order1 : orderList) {
//                Log.i("zqr", "order1=" + order1);
//            }
//        }

        // 调用者
        IOrder order = new PersonalOrder();
        order.setOrderName("iphone7");
        order.setOrderNumber(670);
        List<IOrder> orderList = OrderUtil.splitOrder(order);
        if (orderList != null) {
            for (IOrder order1 : orderList) {
                Log.i("zqr", "neworder1=" + order1);
            }
        }
    }
}
