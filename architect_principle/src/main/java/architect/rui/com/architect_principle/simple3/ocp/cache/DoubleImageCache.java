package architect.rui.com.architect_principle.simple3.ocp.cache;

import android.graphics.Bitmap;

import architect.rui.com.architect_principle.simple2.srp2.srp.SDCardImageCache;

/**
 * 作者: zengqinrui on 18/1/21 22:51
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 双缓存
 * 备注: 内存缓存 + sdcard缓存
 */

public class DoubleImageCache implements ImageCache{

    private MemoryImageCache memoryCache;
    private SDCardImageCache sdCardImageCache;

    public DoubleImageCache() {
        memoryCache = new MemoryImageCache();
        sdCardImageCache = new SDCardImageCache();
    }

    @Override
    public void cache(String imageUrl, Bitmap bitmap) {
        memoryCache.cache(imageUrl, bitmap);
        sdCardImageCache.cache(imageUrl, bitmap);
    }

    @Override
    public Bitmap get(String imageUrl) {
        Bitmap bitmap = memoryCache.get(imageUrl);
        if (bitmap == null) {
            bitmap = sdCardImageCache.get(imageUrl);
        }
        return bitmap;
    }
}
