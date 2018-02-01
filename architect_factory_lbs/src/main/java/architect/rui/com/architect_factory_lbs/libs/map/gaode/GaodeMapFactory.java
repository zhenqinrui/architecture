package architect.rui.com.architect_factory_lbs.libs.map.gaode;

import android.content.Context;

import architect.rui.com.architect_factory_lbs.libs.map.IMapFactory;
import architect.rui.com.architect_factory_lbs.libs.map.IMapView;
import architect.rui.com.architect_factory_lbs.libs.map.base.AbsMapFactory;

/**
 * 作者: zengqinrui on 18/2/1 15:13
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class GaodeMapFactory extends AbsMapFactory {

    public GaodeMapFactory(Context context) {
        super(context);
    }

    @Override
    public IMapView createMapView() {
        return new GaodeMapView(getContext());
    }
}
