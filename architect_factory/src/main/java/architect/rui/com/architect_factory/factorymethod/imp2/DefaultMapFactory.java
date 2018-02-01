package architect.rui.com.architect_factory.factorymethod.imp2;

import architect.rui.com.architect_factory.factorymethod.IMapView;

/**
 * 作者: zengqinrui on 18/1/31 17:22
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 根据外部传入的要创建对象的类型，根据反射来创建对象，避免需要创建多个具体对象)
 * 备注: 不建议使用，因为外部还是需要依赖具体的产品类，因为你需要传入参数到clz这个参数，变不是完成做到对扩展开放，对修改关闭
 */

public class DefaultMapFactory extends AbsMapFactory {

    @Override
    public <T extends IMapView> T getMapView(Class<T> clz) {
        try {
            T t = clz.newInstance();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
