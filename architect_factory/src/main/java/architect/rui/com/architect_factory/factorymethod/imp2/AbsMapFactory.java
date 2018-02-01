package architect.rui.com.architect_factory.factorymethod.imp2;

import architect.rui.com.architect_factory.factorymethod.IMapView;

/**
 * 作者: zengqinrui on 18/1/31 17:20
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注: 避免要编写多个具体工厂,也可以使用泛型的方式
 */

public abstract class AbsMapFactory {

    /**
     *
     * @param clz 具体要创建的map
     * @param <T>
     * @return
     */
    public abstract <T extends IMapView> T getMapView(Class<T> clz);
}
