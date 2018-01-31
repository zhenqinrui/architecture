package architect.rui.com.architect_factory.simplefactory.impl;

import android.util.Log;
import android.view.View;

import architect.rui.com.architect_factory.simplefactory.IMapView;


/**
 * 作者: zengqinrui on 18/1/31 12:32
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class BaiduMap implements IMapView {

    @Override
    public View getMapView() {
        Log.i("factory", "调用百度地图getview");
        return null;
    }


}
