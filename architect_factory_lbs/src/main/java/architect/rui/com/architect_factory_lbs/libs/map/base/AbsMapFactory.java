package architect.rui.com.architect_factory_lbs.libs.map.base;

import android.content.Context;

import architect.rui.com.architect_factory_lbs.libs.map.IMapFactory;

/**
 * 作者: zengqinrui on 18/2/1 15:16
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public abstract class AbsMapFactory implements IMapFactory {

    private Context context;

    public AbsMapFactory(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

}
