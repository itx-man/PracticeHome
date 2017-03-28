package com.example.Factory;

/**
 * Created by 11041730 on 2017/3/28.
 */

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("The WhiteHuman is White");
    }

    @Override
    public void talk() {
        System.out.println("Thw WhiteHuman say English");
    }
}
