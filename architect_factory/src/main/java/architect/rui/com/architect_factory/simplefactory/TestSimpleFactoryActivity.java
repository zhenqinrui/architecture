package architect.rui.com.architect_factory.simplefactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import architect.rui.com.architect_factory.R;
import architect.rui.com.architect_factory.simplefactory.impl.MapViewFactory;

public class TestSimpleFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 原来做法: 对象由客户端来创建
        // 缺点: 需要new具体的map
//        IMapView mapView = new GaodeMap();
//        mapView.showMap();

        // 方法一: 使用简单工厂或者不使用单例模式直接 new MapViewFactory也可以
        // map创建的细节对客户端来说是掩藏的, 由工厂去创建
        IMapView mapView = MapViewFactory.getInstance().getMapView(MapViewFactory.MapType.Baidu);
        if (mapView != null) {
            mapView.getMapView();
        }
        // 现在做法: 创建对象过程由工厂方法处理, 内部怎么创建对象(mapview)的细节对客户端透明
//        IMapFactory factory = new BaiduMapFactory();
//        factory.getMapView().showMap();

    }
}
