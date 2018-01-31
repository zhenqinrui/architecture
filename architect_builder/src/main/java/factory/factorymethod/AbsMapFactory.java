package factory.factorymethod;

/**
 * 作者: zengqinrui on 18/1/3 22:10
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public abstract class AbsMapFactory {

    public abstract <T extends IMapView> T getView(Class<T> clzz);

}
