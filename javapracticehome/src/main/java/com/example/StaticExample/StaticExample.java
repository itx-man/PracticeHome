package com.example.StaticExample;

/**
 * Created by 11041730 on 2017/3/3.
 */

public class StaticExample {

    //静态块
    static {
        //在类被加载的时候用于初始化某些资源
        System.out.println("StaticExample static block");
        //仅能访问静态变量和静态方法
        str = "Test";
        setCount(2);
    }

    //可以在一个类中有多个静态块
    static {
        System.out.println("StaticExample static block2");
    }

    //静态变量
    private static int count; //保持私有，仅能靠setter方法访问
    public static String str;

    public int getCount() {
        return count;
    }

    //静态方法
    public static void setCount(int count) {
        if (count > 0)
            StaticExample.count = count;
    }

    //静态工具方法
    public static int addInts(int i, int ...js) {
        int sum = i;
        for (int x : js) sum += x;
        return sum;
    }

    //静态类的例子
    public static class MyStaticClass {
        public int count;
    }
}
