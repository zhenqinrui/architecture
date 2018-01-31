package architect.rui.com.architect_singleton.singleton.hungry_doublecheck;

import android.util.Log;

/**
 * 作者: zengqinrui on 18/1/31 09:57
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 双重检查（折中考虑，既不浪费内存，性能相对来说也比较高）
 * 备注: 推荐用这种
 */

public class Singleton {

    //volatile--会屏蔽虚拟机优化过程
    private static volatile Singleton instance;

    private Singleton() {

    }

    public static final Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void test() {
        Log.i("singleton", "单例模式-懒加载-双重检查");
    }
}
