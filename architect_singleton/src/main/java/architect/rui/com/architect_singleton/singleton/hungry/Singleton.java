package architect.rui.com.architect_singleton.singleton.hungry;

import android.util.Log;

/**
 * 作者: zengqinrui on 18/1/31 10:07
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 饿汉式-耗内存
 * 备注: 线程安全
 */

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void test() {
        Log.i("singleton", "单例模式-饿汉式");
    }
}
