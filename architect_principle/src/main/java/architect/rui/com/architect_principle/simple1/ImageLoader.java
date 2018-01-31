package architect.rui.com.architect_principle.simple1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/**
 * 作者: zengqinrui on 18/1/21 21:21
 * 邮箱：zengqinrui@szy.cn
 * 功能描述: 图片加载
 * 备注: 初级写法
 */

public class ImageLoader {

    private HashMap<String, Bitmap> map;

    public ImageLoader() {
        map = new HashMap<>();
    }

    // 加载图片
    public void loadImage(Context context, final String imageUrl, final ImageView imageView) {
        if (TextUtils.isEmpty(imageUrl) || imageView == null) {
            return;
        }
        imageView.setTag(imageUrl);
        // 图片缓存
        Bitmap bitmap = map.get(imageUrl);
        if (bitmap == null) {
            bitmap = downloadImage(imageUrl);
        }
        final Bitmap tempBitmap = bitmap;
        if (tempBitmap != null) {
            map.put(imageUrl, tempBitmap);
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

    // 下载图片
    private Bitmap downloadImage(String imageUrl) {
        InputStream in = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            in = connection.getInputStream();
            Bitmap bitmap = BitmapFactory.decodeStream(in);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
