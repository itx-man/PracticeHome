package com.example.callback;

/**
 * Created by 11041730 on 2017/3/7.
 * 定义Button
 */

public class Button extends java.awt.Button {
    OnClickListener listener;

    public void click() {
        listener.OnClick(this);
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
}
