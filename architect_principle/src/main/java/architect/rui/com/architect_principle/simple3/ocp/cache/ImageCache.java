package architect.rui.com.architect_principle.simple3.ocp.cache;

import android.graphics.Bitmap;

/**
 * 作者: zengqinrui on 18/1/21 22:14
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 图片缓存
 * 备注:
 */

public interface ImageCache {

    void cache(String imageUrl, Bitmap bitmap);

    Bitmap get(String imageUrl);
}
