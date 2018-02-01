package architect.rui.com.architect_factory_lbs.libs.map.baidu;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.baidu.mapapi.map.MapView;

import architect.rui.com.architect_factory_lbs.libs.map.base.AbsMapView;

/**
 * 作者: zengqinrui on 18/2/1 14:44
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class BaiduMapView extends AbsMapView {

    private MapView mapView;

    public BaiduMapView(Context context) {
        super(context);
    }

    private MapView getMapView() {
        if (mapView == null) {
            mapView = new MapView(getContext());
        }
        return mapView;
    }

    @Override
    public View getView() {
        return getMapView();
    }

    @Override
    public void onCreate(Context context, Bundle savedInstanceState) {
        super.onCreate(context, savedInstanceState);
        getMapView().onCreate(context, savedInstanceState);
    }

    @Override
    public void onResume() {
        getMapView().onResume();
    }

    @Override
    public void onPause() {
        getMapView().onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        getMapView().onSaveInstanceState(outState);
    }

    @Override
    public void onDestroy() {
        getMapView().onDestroy();
    }
}
