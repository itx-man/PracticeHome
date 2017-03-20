package com.vivi.globalvariable;

import android.app.Application;

/**
 * Created by 11041730 on 2017/3/13.
 * Application和Activity,Service一样是android框架一个系统组件，当android程序启动时系统创建一个
 * application对象，用来存储系统的一些信息。一般继承Application并在manifest标签中进行注册（只
 * 需要给Application标签增加个name属性把自己的Application的名字写入即可。）
 * 我们在application继承类中写一个set get变量的方法，然后通过一个activity利用application的set
 * 方法来设置这个变量的值，在另一个activity中取得这个MainActivity
 */

public class MyApplication extends Application {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
