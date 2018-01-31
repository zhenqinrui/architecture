package architect.rui.com.architect_singleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import architect.rui.com.architect_singleton.singleton.hungry_synchronized.Singleton;

public class MainActivity extends AppCompatActivity {

    private Singleton hungrySynchronized;
    private architect.rui.com.architect_singleton.singleton.hungry.Singleton hungrySingleton;
    private architect.rui.com.architect_singleton.singleton.hungry_doublecheck.Singleton doubleCheckSingleton;

    private architect.rui.com.architect_singleton.singleton.innerclass.Singleton innerSingleton;
    private architect.rui.com.architect_singleton.singleton.lazy.Singleton lazySingleton;

    private architect.rui.com.architect_singleton.singleton.enumsingle.Singleton enumSingleton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hungrySynchronized = Singleton.getInstance();
        hungrySynchronized.test();

        innerSingleton = architect.rui.com.architect_singleton.singleton.innerclass.Singleton
                .getInstance();
        innerSingleton.test();

        hungrySingleton = architect.rui.com.architect_singleton.singleton.hungry.Singleton.getInstance();
        hungrySingleton.test();

        doubleCheckSingleton = architect.rui.com.architect_singleton.singleton.hungry_doublecheck.Singleton.getInstance();
        doubleCheckSingleton.test();

        lazySingleton = architect.rui.com.architect_singleton.singleton.lazy.Singleton.getInstance();
        lazySingleton.test();

        enumSingleton = architect.rui.com.architect_singleton.singleton.enumsingle.Singleton.Instance;
        enumSingleton.test();

    }
}
