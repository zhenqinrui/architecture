package architect.rui.com.architect_principle.simple2.srp2.srp;

import android.graphics.Bitmap;

import java.util.HashMap;

/**
 * 作者: zengqinrui on 18/1/21 22:18
 * 邮箱：zengqinrui@szy.cn
 * 功能描述:
 * 备注:
 */

public class ImageCache {

    private HashMap<String, Bitmap> map;

    public ImageCache() {
        map = new HashMap<>();
    }

    public void cache(String imageUrl, Bitmap bitmap) {
        map.put(imageUrl, bitmap);
    }

    public Bitmap get(String imageUrl) {
        map.get(imageUrl);
    }
}
