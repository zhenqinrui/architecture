package architect.rui.com.architect_factory_lbs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.amap.api.maps.MapView;

import architect.rui.com.architect_factory_lbs_gaode.GaodeMapFactory;
import architect.rui.com.architect_lbs_base.IMapView;


/**
 * 一般的做法： 在代码中直接嵌入第三方地图sdk mapview，这样就造成直接依赖了第三方sdk，因此给后续如果要替换第三方造成了不便，这时候就可以使用工厂方法抽象mapview
 *
 *
 * 分析： 角色？
 * 工厂的目的： 创建地图
 * 地图类型: 百度地图、高德地图等?
 * 从各自使用百度、高德地图中，找差异?
 * 百度地图： MapView 继承 ViewGroup
 * 高德地图: MapView 继承 ViewGroup
 *    标准1：都是继承view，定义view的统一标准,返回view
 *    标准2：都存在生命周期，因此可以定义抽象的生命周期统一接口
 *    角色一: 抽象产品: IMapView，根据以上两个准备定义接口
 *    角色二: 具体产品: BaiduMapView
 *    角色三: 具体产品: GaodeMapView
 *    角色四: 抽象工厂: IMapFactory
 *    角色五: 具体工厂: BaiduMapFactory、GaodeMapFactory
 *
 *    这种做法的问题？ 1、想下如下问题？
 *    1、如果项目不需要百度地图了，客户端改的话 确实是只需要把工厂对应对具体的工厂，但是百度地图的相关jar包，按理来说你应该从项目中删除了，
 *    这时候就麻烦了，还要一个一个去删，同理，高德地图也一样
 *
 *     怎么解决？
 *    解决方案：抽离出基于地图的抽象工程，在基于这个抽象工程，具体创建一个百度地图实现的工程、高德地图实现的工程，客户端只需要引用具体的工程即可
 *    当需要切换地图时，只需要修改下引用的工程配置，不需要删除任何资源等，只需要修改下具体创建出来的引擎，基本不需要修改什么代码，就可以实现一键切换地图
 */
//public class GaodeMapActivity extends AppCompatActivity {
//
//    MapView mapView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_gaodemap);
//        mapView = (MapView) findViewById(R.id.gaode_map);
//        mapView.onCreate(savedInstanceState);
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
//        mapView.onDestroy();
//    }
//
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
//        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
//        mapView.onSaveInstanceState(outState);
//    }
//}

/**
 * 使用工厂设计模式的做法
 */
public class GaodeMapActivity extends AppCompatActivity {

    IMapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapView = new GaodeMapFactory(this).createMapView();
        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.map_container);
        frameLayout.addView(mapView.getView());
        mapView.onCreate(this, savedInstanceState);
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
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，保存地图当前的状态
        mapView.onSaveInstanceState(outState);
    }
}

