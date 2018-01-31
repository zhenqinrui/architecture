package singleton;

/**
 * 作者: zengqinrui on 17/12/30 22:17
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

/**
 * 懒加载
 * 优点: 使用时创建
 * 缺点: 存在线程安全
 * 改进: Singleton3
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    // 3个线程同时调用getInstance，存在可能创建出多个对象隐患
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

