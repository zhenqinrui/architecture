package architect.rui.com.architect_principle.simple2.srp2.srp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;

/**
 * 作者: zengqinrui on 18/1/21 21:21
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 图片加载
 * 备注: 使用单一职责原则 Single Responsibility Principle
 * 前提： 使用单一职责原则 Single Responsibility Principle
 * 需求： 需要新增sdcard缓存，先从sdcard读，在从内存中读，这时候就需要修改imageloader中loadimage的逻辑，在这边添加该逻辑
 */

public class ImageLoader {

    private ImageCache imageCache;
    private SDCardImageCache sdCardImageCache;

    public ImageLoader() {
        imageCache = new ImageCache();
        sdCardImageCache = new SDCardImageCache();
    }

    // 加载图片
    public void loadImage(Context context, final String imageUrl, final ImageView imageView) {
        if (TextUtils.isEmpty(imageUrl) || imageView == null) {
            return;
        }
        imageView.setTag(imageUrl);
        // 先从内存读取
        Bitmap bitmap = imageCache.get(imageUrl);
        if (bitmap == null) {
            bitmap = sdCardImageCache.get(imageUrl);
        }
        if (bitmap == null) {
            ImageDownloader.getInstance().downloadImage(imageUrl);
        }
        final Bitmap tempBitmap = bitmap;
        if (tempBitmap != null) {
            imageCache.cache(imageUrl, tempBitmap);
            sdCardImageCache.cache(imageUrl, tempBitmap);
            ((Activity)context).runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (imageUrl.equals(imageView.getTag())) {
                        imageView.setImageBitmap(tempBitmap);
                    }
                }
            });
        }
    }


}
