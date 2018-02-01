package architect.rui.com.architect_factory_lbs;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * 作者: zengqinrui on 18/2/1 13:31
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化百度地图使用
        SDKInitializer.initialize(getApplicationContext());
    }
}
