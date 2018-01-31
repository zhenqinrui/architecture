package architect.rui.com.architect_singleton.singleton.lazy;

import android.util.Log;

/**
 * 作者: zengqinrui on 18/1/31 09:50
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 懒加载模式——对多线程要求不高的，基本都用这种
 * 备注: 线程不安全
 */

public class Singleton {

    /**
     * 特点2：静态实体
     */
    private static Singleton instance;

    /**
     * 特点1： 私有构造函数
     */
    private Singleton() {

    }

    public static final Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void test() {
        Log.i("singleton", "单例模式-懒加载");
    }
}
