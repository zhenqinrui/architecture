package architect.rui.com.architect_factory_lbs.libs.map;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/**
 * 作者: zengqinrui on 18/2/1 14:30
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 定义地图的标准，返回的地图view必须是view的子类
 * 备注:
 */

//工厂方法模式-角色1: 抽象产品
public interface IMapView {

    // 标准1：view的子类
    View getView();

    // 标准2：生命周期
    // 创建初始化
    void onCreate(Context context, Bundle savedInstanceState);

    // 恢复显示
    void onResume();

    // 暂停
    void onPause();

    // 保存状态
    void onSaveInstanceState(Bundle outState);

    // 销毁地图
    void onDestroy();
}
