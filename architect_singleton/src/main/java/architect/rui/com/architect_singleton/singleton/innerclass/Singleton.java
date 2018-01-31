package architect.rui.com.architect_singleton.singleton.innerclass;

import android.util.Log;

/**
 * 作者: zengqinrui on 18/1/31 10:18
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 静态内部类-线程安全，也避免了提前创建
 * 备注:
 */

public class Singleton {


    private Singleton(){

    }

    public static class SingletonHold{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHold.instance;
    }

    public void test() {
        Log.i("singleton", "单例模式-静态内部类模式");
    }
}
