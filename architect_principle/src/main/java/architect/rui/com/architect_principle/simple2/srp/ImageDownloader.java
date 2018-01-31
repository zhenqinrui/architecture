package architect.rui.com.architect_principle.simple2.srp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 作者: zengqinrui on 18/1/21 21:48
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class ImageDownloader {


    private static ImageDownloader instance;

    private ImageDownloader(){}

    public static ImageDownloader getInstance() {
        if (instance == null) {
            instance = new ImageDownloader();
        }
        return instance;
    }

    // 下载图片
    public Bitmap downloadImage(String imageUrl) {
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
