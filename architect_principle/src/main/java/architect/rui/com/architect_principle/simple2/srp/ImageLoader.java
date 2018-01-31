package architect.rui.com.architect_principle.simple2.srp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;

import java.util.HashMap;

/**
 * 作者: zengqinrui on 18/1/21 21:21
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 图片加载
 * 备注: 使用单一职责原则 Single Responsibility Principle
 */

public class ImageLoader {

    private ImageCache imageCache;

    public ImageLoader() {
        imageCache = new ImageCache();
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
