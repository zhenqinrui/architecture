package architect.rui.com.architect_lbs_base;

/**
 * 作者: zengqinrui on 18/2/1 15:04
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 抽象工厂
 * 备注:
 */

// 工厂标准->生产地图、生产定位
public interface IMapFactory {

    IMapView createMapView();

}
