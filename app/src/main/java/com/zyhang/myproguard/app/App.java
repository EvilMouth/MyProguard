package com.zyhang.myproguard.app;

import android.app.Application;
import android.util.Log;

/**
 * Created by zyhang on 2018/9/21.15:18
 */

public class App extends Application {

    private static final String TAG = "App";

    @Override
    public void onCreate() {
        super.onCreate();

        Test test = new Test(1);
        Log.i(TAG, "onCreate: test === " + test);
    }
}
