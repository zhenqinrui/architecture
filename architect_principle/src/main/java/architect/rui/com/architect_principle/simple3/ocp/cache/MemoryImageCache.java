package architect.rui.com.architect_principle.simple3.ocp.cache;

import android.graphics.Bitmap;

import java.util.HashMap;

/**
 * 作者: zengqinrui on 18/1/21 22:15
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 内存缓存
 * 备注:
 */

public class MemoryImageCache implements ImageCache {

    private HashMap<String, Bitmap> memoryCacheMap;

    public MemoryImageCache() {
        memoryCacheMap = new HashMap<String, Bitmap>();
    }


    @Override
    public void cache(String imageUrl, Bitmap bitmap) {
        memoryCacheMap.put(imageUrl, bitmap);
    }

    @Override
    public Bitmap get(String imageUrl) {
        return memoryCacheMap.get(imageUrl);
    }
}
