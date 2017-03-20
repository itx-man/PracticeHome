package com.vivi.globalvariable;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by 11041730 on 2017/3/13.
 */

public class ShowNameActivity extends Activity {
    private MyApplication myApplication;
    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showname);
        myApplication = (MyApplication) getApplication();
        String name = myApplication.getName();
        textView = (TextView) findViewById(R.id.tv_showname);
        textView.setText(name.toLowerCase());
    }
}
