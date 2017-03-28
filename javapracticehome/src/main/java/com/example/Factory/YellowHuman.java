package com.example.Factory;

/**
 * Created by 11041730 on 2017/3/28.
 */

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("The YellowHuman is Yellow");
    }

    @Override
    public void talk() {
        System.out.println("The YellowHuman say Chinese");
    }
}
