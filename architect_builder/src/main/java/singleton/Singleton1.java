package singleton;

/**
 * 作者: zengqinrui on 17/12/30 22:13
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 通常写法
 * 备注: 单机模式几个特点: 1、私有构造函数，2、持有对象静态方法获取
 */

import android.util.Log;

/**
 * 饿加载
 * 优点: 线程安全、耗内存、一开始就创建
 * 改进: Singleton2
 */
public class Singleton1 {

    private Singleton1 singleton1 = new Singleton1();

    private Singleton1() {}

    private Singleton1 getInstance() {
        return  singleton1;
    }

    public void show() {
        Log.i("zqr", "show");
    }
}
