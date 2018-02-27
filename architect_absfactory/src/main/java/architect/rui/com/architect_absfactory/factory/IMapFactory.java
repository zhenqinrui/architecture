package architect.rui.com.architect_absfactory.factory;

import architect.rui.com.architect_absfactory.location.ILocation;
import architect.rui.com.architect_absfactory.map.IMapView;

/**
 * 作者: zengqinrui on 18/2/13 20:22
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 抽象工厂，两条流水线
 * 备注:
 */
public interface IMapFactory {

    IMapView createMapView();

    ILocation createLocation();
}
