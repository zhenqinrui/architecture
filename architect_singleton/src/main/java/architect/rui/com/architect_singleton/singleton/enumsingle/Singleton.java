package architect.rui.com.architect_singleton.singleton.enumsingle;

import android.util.Log;

/**
 * 作者: zengqinrui on 18/1/31 10:27
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 枚举实现单例模式(不常用)
 * 备注:
 */

public enum Singleton {

    Instance;

    public void test() {
        Log.i("singleton", "单例模式-枚举");
    }
}
