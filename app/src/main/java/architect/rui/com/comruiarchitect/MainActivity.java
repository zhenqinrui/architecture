package architect.rui.com.comruiarchitect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import builder.Charge;
import factory.factorymethod.AbsMapFactory;
import factory.factorymethod.BaiduMapView;
import factory.factorymethod.DefaultMapFactory;
import factory.factorymethod.GaodeMapFactory;
import factory.factorymethod.GaodeMapView;
import factory.factorymethod.IMapFactory;
import factory.factorymethod.IMapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Charge.Builder().orderId("123456").channel("alipay").product("nba球衣").build().pay();

        // 简单工厂，用于单一模块，比如只需要获取mapview,缺点，在工厂中需要去判断if else
//        IMapView mapView = MapFactory.getInstance().getMapView(MapFactory.MapType.BAIDU);
//        View view = mapView.getView();


        // 工厂方法，如百度地图有全景模式，但是高德地图没有全景模式，但是又不能写在简单工厂中，因为高德没有这场景
        IMapFactory mapFactory = GaodeMapFactory.getInstance();
        mapFactory.getView();

        // 工厂方法进阶版，使用泛型
        AbsMapFactory factory = DefaultMapFactory.getInstance();
        IMapView mapView = factory.getView(GaodeMapView.class);
    }
}
