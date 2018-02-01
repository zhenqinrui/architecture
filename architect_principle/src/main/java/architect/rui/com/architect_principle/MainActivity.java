package architect.rui.com.architect_principle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import architect.rui.com.architect_principle.simple3.ocp.ImageLoader;
import architect.rui.com.architect_principle.simple3.ocp.cache.DoubleImageCache;
import architect.rui.com.architect_principle.simple3.ocp.cache.ImageCache;
import architect.rui.com.architect_principle.simple3.ocp.cache.MemoryImageCache;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ImageCache imageCache = new MemoryImageCache();
        ImageCache imageCache = new DoubleImageCache();
        ImageLoader loader = new ImageLoader(imageCache);
//        loader.loadImage(this, "http://www.baidu.com", imageview);

    }
}
