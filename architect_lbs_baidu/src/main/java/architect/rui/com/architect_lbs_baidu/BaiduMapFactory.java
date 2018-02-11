package architect.rui.com.architect_lbs_baidu;

import android.content.Context;

import architect.rui.com.architect_lbs_base.AbsMapFactory;
import architect.rui.com.architect_lbs_base.IMapView;


/**
 * 作者: zengqinrui on 18/2/1 15:12
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注: 具体工厂
 */

public class BaiduMapFactory extends AbsMapFactory {

    public BaiduMapFactory(Context context) {
        super(context);
    }

    @Override
    public IMapView createMapView() {
        return new BaiduMapView(getContext());
    }


}


