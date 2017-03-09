package com.example.StaticExample;

import com.example.StaticExample.StaticExample;

/**
 * Created by 11041730 on 2017/3/3.
 */

public class TestStatic {
    public static void main(String[] args ) {
        StaticExample.setCount(5);

        //非私有的静态变量可以通过类名来访问
        StaticExample.str = "abc";
        StaticExample se = new StaticExample();
        System.out.println(se.getCount());

        //类的静态变量和实例的静态变量是一样的
        System.out.println(StaticExample.str + " is same as " + se.str);
        System.out.println(StaticExample.str == se.str);

        //静态嵌套类和其他外层类一样
        StaticExample.MyStaticClass myStaticClass = new StaticExample.MyStaticClass();
        myStaticClass.count = 10;

        StaticExample.MyStaticClass myStaticClass1 = new StaticExample.MyStaticClass();
        myStaticClass.count = 20;

        System.out.println(myStaticClass.count);
        System.out.println(myStaticClass1.count);

    }
}
