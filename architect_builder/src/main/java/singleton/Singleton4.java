package singleton;

/**
 * 作者: zengqinrui on 18/1/1 19:47
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注: 使用对象锁
 */

public class Singleton4 {

    //线程并发时候，当我们的变量被被修改之后，其他的并发线程及时收到通知，其他的线程就可以访问数据
    //volatile--会屏蔽虚拟机优化过程
    private volatile static Singleton4 instance;

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                instance = new Singleton4();
            }
        }
        return instance;
    }
}

