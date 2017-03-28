package com.example.Factory;

/**
 * Created by 11041730 on 2017/3/28.
 */

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("The BlackHuman is Black");
    }

    @Override
    public void talk() {
        System.out.println("The BlackHuman say English");
    }
}
