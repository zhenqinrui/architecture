package architect.rui.com.architect_factory.simplefactory.impl;


import architect.rui.com.architect_factory.simplefactory.IMapView;

/**
 * 作者: zengqinrui on 18/1/31 13:06
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 工厂方法之——简单工厂
 * 备注: // 使用单例模式、或者不使用客户端直接创建factory也可以，但是一般工厂只需要一个就好，固使用单例
 */

public class MapViewFactory {

    public enum MapType{
        Baidu, Gaode;
    }

    private static MapViewFactory instance;

    private MapViewFactory() {

    }

    public static MapViewFactory getInstance() {
        if (instance == null) {
            instance = new MapViewFactory();
        }
        return instance;
    }


    /**
     * 简单工厂的方法
     * @param type
     * @return 创建好的对象供外部使用
     */
    public IMapView getMapView(MapType type) {
        IMapView mapView = null;
        switch (type) {
            case Baidu:
                mapView = new BaiduMap();
                break;
            case Gaode:
                mapView = new GaodeMap();
                break;
        }
        return mapView;
    }
}
