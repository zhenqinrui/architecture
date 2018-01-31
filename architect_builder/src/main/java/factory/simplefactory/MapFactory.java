package factory.simplefactory;

/**
 * 作者: zengqinrui on 18/1/3 21:55
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class MapFactory {

    private static MapFactory instance;

    private MapFactory() {}

    public enum MapType{
        BAIDU, GAODE
    }

    public static MapFactory getInstance() {
        if (instance == null) {
            instance = new MapFactory();
        }
        return instance;
    }

    public IMapView getMapView(MapType mapType) {
        IMapView mapView = null;
        switch (mapType) {
            case BAIDU:
                mapView = new BaiduMapView();
                break;
            case GAODE:
                mapView = new GaodeMapView();
                break;
        }
        return mapView;
    }
}
