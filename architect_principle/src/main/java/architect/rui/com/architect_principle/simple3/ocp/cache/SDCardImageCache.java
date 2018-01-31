package architect.rui.com.architect_principle.simple3.ocp.cache;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 作者: zengqinrui on 18/1/21 22:46
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class SDCardImageCache implements ImageCache {

    public void cache(String imageUrl, Bitmap bitmap) {
        FileOutputStream fileOutputStream = null;
        try {
            // 图片文件，自己去写。。。
            fileOutputStream = new FileOutputStream("/xxxx/" + imageUrl);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Bitmap get(String imageUrl) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/xxxx/" + imageUrl);
            Bitmap bitmap = BitmapFactory.decodeStream(fileInputStream);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
