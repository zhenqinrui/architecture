package architect.rui.com.architect_factory_lbs_gaode;

import android.content.Context;

import architect.rui.com.architect_lbs_base.AbsMapFactory;
import architect.rui.com.architect_lbs_base.IMapView;

import static java.security.AccessController.getContext;


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