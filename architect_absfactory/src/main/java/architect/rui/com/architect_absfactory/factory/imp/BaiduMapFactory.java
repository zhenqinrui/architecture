package architect.rui.com.architect_absfactory.factory.imp;

import architect.rui.com.architect_absfactory.factory.IMapFactory;
import architect.rui.com.architect_absfactory.location.ILocation;
import architect.rui.com.architect_absfactory.location.imp.BaiduLocation;
import architect.rui.com.architect_absfactory.map.BaiduMapView;
import architect.rui.com.architect_absfactory.map.IMapView;

/**
 * 作者: zengqinrui on 18/2/13 20:22
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 抽象工厂模式
 * 备注: 两个产品线-》地图和地位
 */

public class BaiduMapFactory implements IMapFactory {

    @Override
    public IMapView createMapView() {
        return new BaiduMapView();
    }

    @Override
    public ILocation createLocation() {
        return new BaiduLocation();
    }
}
