package architect.rui.com.architect_absfactory.factory.imp;

import architect.rui.com.architect_absfactory.factory.IMapFactory;
import architect.rui.com.architect_absfactory.location.ILocation;
import architect.rui.com.architect_absfactory.location.imp.GaodeLocation;
import architect.rui.com.architect_absfactory.map.GaodeMapView;
import architect.rui.com.architect_absfactory.map.IMapView;

/**
 * 作者: zengqinrui on 18/2/13 20:22
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class GaodeMapFactory implements IMapFactory {

    @Override
    public IMapView createMapView() {
        return new GaodeMapView();
    }

    @Override
    public ILocation createLocation() {
        return new GaodeLocation();
    }
}
