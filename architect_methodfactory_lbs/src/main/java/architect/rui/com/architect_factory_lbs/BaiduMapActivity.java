package architect.rui.com.architect_factory_lbs;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.baidu.mapapi.map.MapView;

import architect.rui.com.architect_lbs_baidu.BaiduMapFactory;
import architect.rui.com.architect_lbs_base.IMapView;

/**
 * 一般的做法： 在代码中直接嵌入第三方地图sdk mapview，这样就造成直接依赖了第三方sdk，因此给后续如果要替换第三方造成了不便，这时候就可以使用工厂方法抽象mapview
 * 具体分析在GaodeMapActivity
 */
//public class BaiduMapActivity extends AppCompatActivity {
//
//    MapView mapView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_baidumap);
//        mapView = (MapView) findViewById(R.id.bmapView);
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
//        mapView.onDestroy();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
//        mapView.onResume();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
//        mapView.onPause();
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        mapView.onSaveInstanceState(outState);
//    }
//}

/**
 * 使用工厂方法设计模式的做法
 */
public class BaiduMapActivity extends AppCompatActivity {

    IMapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapView = new BaiduMapFactory(this).createMapView();
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.map_container);
        frameLayout.addView(mapView.getView());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mapView.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }
}
