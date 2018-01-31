package architect.rui.com.architect_factory.factorymethod;

import android.view.View;

/**
 * 作者: zengqinrui on 18/1/31 12:31
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 定义map的规范
 * 备注:
 */

public interface IMapView {

    View getMapView(); // 规范1： 得到一个类型为view的map

}
