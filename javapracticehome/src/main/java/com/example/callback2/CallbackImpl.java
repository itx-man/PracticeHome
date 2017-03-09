package com.example.callback2;

/**
 * Created by 11041730 on 2017/3/9.
 */

public class CallbackImpl implements Callback{
    @Override
    public void methodToCallback() {
        System.out.println("I've been called back");
    }
}
