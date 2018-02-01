package architect.rui.com.architect_factory_lbs.libs.map;

/**
 * 作者: zengqinrui on 18/2/1 15:04
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 抽象工厂
 * 备注:
 */

// 工厂标准->生产地图
public interface IMapFactory {

    IMapView createMapView();
}
