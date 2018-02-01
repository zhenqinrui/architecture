package architect.rui.com.architect_factory_lbs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.amap.api.maps.MapView;


/**
 * 一般的做法： 在代码中直接嵌入第三方地图sdk mapview，这样就造成直接依赖了第三方sdk，因此给后续如果要替换第三方造成了不便，这时候就可以使用工厂方法抽象mapview
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
 */
public class GaodeMapActivity extends AppCompatActivity {

    MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaodemap);
        mapView = (MapView) findViewById(R.id.gaode_map);
        mapView.onCreate(savedInstanceState);
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
