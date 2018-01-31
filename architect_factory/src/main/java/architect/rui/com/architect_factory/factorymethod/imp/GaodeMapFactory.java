package architect.rui.com.architect_factory.factorymethod.imp;

import architect.rui.com.architect_factory.factorymethod.IMapFactory;
import architect.rui.com.architect_factory.factorymethod.IMapView;

/**
 * 作者: zengqinrui on 18/1/31 12:34
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class GaodeMapFactory implements IMapFactory {

    @Override
    public IMapView getMapView() {
        return new GaodeMap();
    }
}
