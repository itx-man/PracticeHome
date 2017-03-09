package com.example.callback2;

/**
 * Created by 11041730 on 2017/3/9.
 *
 */

public class Caller {
    public void register(Callback callback) {
        callback.methodToCallback();
    }

    public static void main(String[] args) {
        Caller caller = new Caller();
        /* method 1
        Callback callBack = new CallbackImpl();
        caller.register(callBack); */
        caller.register(new CallbackImpl());
    }

}
