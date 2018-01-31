package singleton;

/**
 * 作者: zengqinrui on 18/1/1 19:49
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注: 使用静态内部类,保证对象唯一
 */

public class Singleton5 {

    private Singleton5(){}

    public static Singleton5 getInstance() {
        return SingleHold.instance;
    }

    public static final class SingleHold{
        private static Singleton5 instance = new Singleton5();
    }
}
