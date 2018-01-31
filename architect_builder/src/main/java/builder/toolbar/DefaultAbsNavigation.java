package builder.toolbar;

import android.content.Context;
import android.view.ViewGroup;

/**
 * 作者: zengqinrui on 17/12/26 22:41
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 默认的导航栏，
 * 备注:
 */

public class DefaultAbsNavigation extends AbsNavigation<DefaultAbsNavigation.Builder> {

    public DefaultAbsNavigation(Builder builder) {
        super(builder);
    }

    public static class Builder extends AbsNavigation.Builder{

        public Builder(Context context, ViewGroup parent) {
            super(context, parent);
        }

        @Override
        public INavigation build() {
            return null;
        }
    }

    public static class HomeNavigationParams extends NavigationParams{
        public HomeNavigationParams(Context context, ViewGroup parent) {
            super(context, parent);
        }


    }
}
