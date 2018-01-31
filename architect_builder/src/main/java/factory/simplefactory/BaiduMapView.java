package factory.simplefactory;

import android.util.Log;
import android.view.View;

/**
 * 作者: zengqinrui on 18/1/3 21:54
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class BaiduMapView implements IMapView {

    @Override
    public View getView() {
        Log.i("zqr", "百度mapview");
        return null;
    }
}
