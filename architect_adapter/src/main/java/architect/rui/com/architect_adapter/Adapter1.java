package architect.rui.com.architect_adapter;

/**
 * 作者: zengqinrui on 18/1/15 21:15
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 对象适配器（基于代理模式)
 * 备注: 目的是为了把旧版本的美元转换为新版的人民币换算，新旧接口不兼容，需要将旧接口转换为新接口，可以一起使用，这就是适配器的模式
 *
 * 1、不需要继承
 * 2、实现目标接口
 *
 *
 *
 */

public class Adapter1 implements Target{

    private Adaptee adaptee;

    public Adapter1(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public float getRMB() {
        return adaptee.getDollor() * 6.5f;
    }
}
