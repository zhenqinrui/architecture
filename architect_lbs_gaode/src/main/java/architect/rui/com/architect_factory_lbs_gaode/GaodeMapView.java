
package architect.rui.com.architect_factory_lbs_gaode;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.amap.api.maps.MapView;

import architect.rui.com.architect_lbs_base.AbsMapView;


/**
 * 作者: zengqinrui on 18/2/1 14:57
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 高德地图view
 * 备注:
 */

public class GaodeMapView extends AbsMapView {

    private MapView mapView;

    private MapView getMapView() {
        if (mapView == null) {
            mapView = new MapView(getContext());
        }
        return mapView;
    }

    public GaodeMapView(Context context) {
        super(context);
    }

    @Override
    public void onCreate(Context context, Bundle savedInstanceState) {
        super.onCreate(context, savedInstanceState);
        getMapView().onCreate(savedInstanceState);
    }

    @Override
    public View getView() {
        return getMapView();
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