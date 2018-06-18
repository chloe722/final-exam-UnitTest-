package thhsu.chloe.finalexam;

import android.app.Application;
import android.content.Context;

/**
 * Created by Chloe on 6/18/2018.
 */

public class AwsCafe extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getAppContext(){return mContext;}
}
