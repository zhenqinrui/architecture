package architect.rui.com.architect_principle.simple3.ocp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;

import java.util.HashMap;

import architect.rui.com.architect_principle.simple3.ocp.cache.ImageCache;

/**
 * 作者: zengqinrui on 18/1/21 21:21
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 图片加载
 * 备注: 实现双缓存
 */

public class ImageLoader {

    private ImageCache imageCache;

    public ImageLoader(ImageCache imageCache) {
        this.imageCache = imageCache;
    }

    // 加载图片
    public void loadImage(Context context, final String imageUrl, final ImageView imageView) {
        if (TextUtils.isEmpty(imageUrl) || imageView == null) {
            return;
        }
        imageView.setTag(imageUrl);
        // 图片缓存
        Bitmap bitmap = imageCache.get(imageUrl);
        if (bitmap == null) {
            bitmap = ImageDownloader.getInstance().downloadImage(imageUrl);
        }
        final Bitmap tempBitmap = bitmap;
        if (tempBitmap != null) {
            imageCache.cache(imageUrl, tempBitmap);
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
