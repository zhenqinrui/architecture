package singleton;

/**
 * 作者: zengqinrui on 18/1/1 19:42
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注: 线程同步，使用synchronized 加锁
 * 优点：线程安全
 * 缺点：存在耗时、锁占用等待
 * 改进: Singleton4
 */

public class Singleton3 {

     private static Singleton3 instance;

     private Singleton3() {

     }

     public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
     }
}
