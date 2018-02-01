package architect.rui.com.architect_factory_lbs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.baidu.mapapi.map.MapView;

import architect.rui.com.architect_factory_lbs.libs.map.IMapFactory;
import architect.rui.com.architect_factory_lbs.libs.map.IMapView;
import architect.rui.com.architect_factory_lbs.libs.map.baidu.BaiduMapFactory;
import architect.rui.com.architect_factory_lbs.libs.map.baidu.BaiduMapView;
import architect.rui.com.architect_factory_lbs.libs.map.gaode.GaodeMapFactory;


/**
 * 使用工厂方法模式,这样客户端MainActivity就不依赖具体的地图了，依赖的是抽象地图IMapView,需要显示哪个地图只需要指定具体的工厂即可，甚至如果进一步避免MainActivity手动修改指定Factory，还可以
 * 从配置文件中读取指定的工厂，达到完成的解耦 
 */
public class MainActivity extends AppCompatActivity {

    private IMapFactory factory;
    private FrameLayout mapContainer;
    private boolean isBaiduMap;
    private IMapView mapView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapContainer = (FrameLayout) findViewById(R.id.map_container);
        // 如果不使用工厂模式，是这样创建的,这样做到了部分的抽象，但是还是没有隐藏BaiduMapView的创建细节
//        IMapView mapView = new BaiduMapView(this);
        // 交给工厂, 通过修改创建的工厂来指定显示什么地图，如果为了修改客户端代码，还可以写入配置中，通过修改配置来实现真正的动态切换，都不需要修改java代码
        factory = new GaodeMapFactory(this);
        mapView = factory.createMapView();
        mapView.onCreate(this, savedInstanceState);
        mapContainer.addView(mapView.getView());
        isBaiduMap = true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    public void baidu(View view) {
        startActivity(new Intent(this, BaiduMapActivity.class));
    }

    public void gaode(View view) {
        startActivity(new Intent(this, GaodeMapActivity.class));
    }


}
