package architect.rui.com.architect_factory_lbs.libs.map.base;

import android.content.Context;
import android.os.Bundle;

import architect.rui.com.architect_factory_lbs.libs.map.IMapView;

/**
 * 作者: zengqinrui on 18/2/1 14:45
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 抽象类，定义地图公共的属性、以及默认子类地图可以不实现的方法
 * 备注:
 */

public abstract class AbsMapView implements IMapView{

    private Context context;

    public AbsMapView(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    @Override
    public void onCreate(Context context, Bundle savedInstanceState) {

    }
}
