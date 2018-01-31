package architect.rui.com.architect_factory.factorymethod;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import architect.rui.com.architect_factory.R;
import architect.rui.com.architect_factory.factorymethod.imp.BaiduMapFactory;
import architect.rui.com.architect_factory.simplefactory.IMapView;
import architect.rui.com.architect_factory.simplefactory.impl.MapViewFactory;

public class TestSimpleFactoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 简单工厂
//        IMapView mapView = MapViewFactory.getInstance().getMapView(MapViewFactory.MapType.Baidu);
//        if (mapView != null) {
//            mapView.getMapView();
//        }
        // 考虑下有以下需求: 百度地图有全景图，其他地图没有，这时候使用简单工厂就不是很好用了，因为MapViewFactory是统一的工厂入口，返回创建的是抽象对象
        // 需求在MapViewFactory中修改代码，而高德又没有，就不应该写在公用的MapViewFactory中，因此引入了工厂方法，即需要对工厂进行抽象（使用接口)
        IMapFactory factory = new BaiduMapFactory();
        factory.getMapView().getMapView();
    }
}
