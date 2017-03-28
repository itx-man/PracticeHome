package com.vivi.contexttest;

import android.app.Application;
import android.util.Log;

/**
 * Created by 11041730 on 2017/3/20.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("yuanle", "MyApplication Created.");
    }
}
