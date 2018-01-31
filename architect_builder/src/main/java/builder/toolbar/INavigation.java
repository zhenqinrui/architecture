package builder.toolbar;

/**
 * 作者: zengqinrui on 17/12/26 21:49
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 抽象所有导航条，必须要有的 布局和创建布局
 * 备注:
 */

public interface INavigation {

    /**
     * 导航条布局
     * @return
     */
    int getLayoutId();

    /**
     * 创建导航条
     * @return
     */
    void inflateLayout();
}
