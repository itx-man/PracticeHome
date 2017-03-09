package com.example.callback;

/**
 * Created by 11041730 on 2017/3/7.
 */

public class Actiity {
    public Actiity() {

    }

    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void OnClick(java.awt.Button b) {
                System.out.println("clicked");
            }
        });
        button.click();
    }
}
