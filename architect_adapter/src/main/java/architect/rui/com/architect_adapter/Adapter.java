package architect.rui.com.architect_adapter;

/**
 * 作者: zengqinrui on 18/1/15 21:15
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 类适配器
 * 备注: 目的是为了把旧版本的美元转换为新版的人民币换算，新旧接口不兼容，需要将旧接口转换为新接口，可以一起使用，这就是适配器的模式
 *
 * 1、继承被适配的类
 * 2、实现目标接口
 *
 */

public class Adapter extends Adaptee implements Target{

    @Override
    public float getRMB() {
        return getDollor() * 6.5f;
    }
}
