package architect.rui.com.architect_factory.simplefactory.impl;


import architect.rui.com.architect_factory.simplefactory.IMapView;

/**
 * 作者: zengqinrui on 18/1/31 13:06
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 简单工厂模式
 * 备注: // 使用单例模式、或者不使用客户端直接创建factory也可以，但是一般工厂只需要一个就好，固使用单例
 */

public class MapFactory {

    public enum MapType{
        Baidu, Gaode; 
    }

    private static MapFactory instance;

    private MapFactory() {

    }

    public static MapFactory getInstance() {
        if (instance == null) {
            instance = new MapFactory();
        }
        return instance;
    }


    /**
     * 简单工厂的方法
     * @param type
     * @return
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
