package factory.factorymethod;

/**
 * 作者: zengqinrui on 18/1/3 22:11
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class DefaultMapFactory extends AbsMapFactory {

    private static DefaultMapFactory instance;

    private DefaultMapFactory() {}

    public static DefaultMapFactory getInstance() {
        if (instance == null) {
            instance = new DefaultMapFactory();
        }
        return instance;
    }

    @Override
    public <T extends IMapView> T getView(Class<T> clzz) {
        try {
            T t = clzz.newInstance();
            return t;
        } catch (Exception e) {

        }

        return null;
    }
}
