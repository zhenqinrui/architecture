package architect.rui.com.architect_singleton.singleton.hungry_synchronized;

import android.util.Log;

/**
 * 作者: zengqinrui on 18/1/31 10:11
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 懒汉式-加锁-不推荐
 * 备注: 安全，但性能最低，99%的场景下，使用getInstance的时候都不需要多线程控制，导致加锁影响了性能。


 */

public class Singleton {

    private static Singleton instance;


    private Singleton() {

    }

    public static final synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void test() {
        Log.i("singleton", "单例模式-懒汉式(加锁性能最低)");
    }

}

