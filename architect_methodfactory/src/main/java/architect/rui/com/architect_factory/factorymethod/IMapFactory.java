package architect.rui.com.architect_factory.factorymethod;

/**
 * 作者: zengqinrui on 18/1/31 12:33
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 定义创建map的规范,规范就是返回的要是IMapView这样的map
 * 备注:
 */

public interface IMapFactory {

    IMapView getMapView();
}
