package architect.rui.com.architect_factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import architect.rui.com.architect_factory.factorymethod.IMapFactory;
import architect.rui.com.architect_factory.factorymethod.imp.BaiduMapFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 原来做法: 对象由客户端来创建
//        IMapView mapView = new GaodeMap();
//        mapView.showMap();

        // 现在做法: 创建对象过程由工厂方法处理, 内部怎么创建对象(mapview)的细节对客户端透明
        IMapFactory factory = new BaiduMapFactory();
        factory.getMapView().showMap();

    }
}
