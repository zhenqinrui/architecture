package factory.factorymethod;

import android.util.Log;

/**
 * 作者: zengqinrui on 18/1/3 22:06
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class GaodeMapFactory implements IMapFactory {

    private static GaodeMapFactory instance;

    private GaodeMapFactory() {}

    public static GaodeMapFactory getInstance() {
        if (instance == null) {
            instance = new GaodeMapFactory();
        }
        return instance;
    }

    @Override
    public IMapView getView() {
        Log.i("zqr", "高德工厂mapview");
        return null;
    }
}
