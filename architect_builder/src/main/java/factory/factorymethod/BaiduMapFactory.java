package factory.factorymethod;

import android.util.Log;

/**
 * 作者: zengqinrui on 18/1/3 22:06
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class BaiduMapFactory implements IMapFactory {

    @Override
    public IMapView getView() {
        Log.i("zqr", "百度工厂getview");
        return null;
    }
}
