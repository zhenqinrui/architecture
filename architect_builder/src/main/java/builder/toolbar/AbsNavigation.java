package builder.toolbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者: zengqinrui on 17/12/26 22:00
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class AbsNavigation<T extends AbsNavigation.Builder> implements INavigation {

    private static final int DEFAULT_LAYOUT_ID = 0;

    private T builder;

    private View titleView;

    public AbsNavigation(T builder) {
        this.builder = builder;
    }

    @Override
    public int getLayoutId() {
        return DEFAULT_LAYOUT_ID;
    }

    @Override
    public void inflateLayout() {
        int layoutId = getLayoutId();
        if (layoutId == DEFAULT_LAYOUT_ID) {
            return;
        }
        if (builder.params == null || builder.params.context == null || builder.params.inflater == null) {
            return;
        }

        if (titleView == null) {
            titleView = builder.params.inflater.inflate(layoutId, builder.params.parent, false);
        }

        if (titleView != null) {
            ViewGroup viewParent = (ViewGroup)titleView.getParent();
            if (viewParent != null) {
                viewParent.removeView(titleView);
            }
            viewParent.addView(titleView);
        }

    }

    /**
     * 构建者
     */
    public abstract static class Builder{

        public NavigationParams params;

        public Builder(Context context, ViewGroup parent) {
            params = new NavigationParams(context, parent);
        }

        public abstract INavigation build();
    }

    /**
     * 产品
     */
    public static class NavigationParams{
        public Context context;
        public ViewGroup parent;
        public LayoutInflater inflater;

        public NavigationParams(Context context, ViewGroup parent) {
            this.context = context;
            this.parent = parent;
            inflater = LayoutInflater.from(context);
        }
    }
}
