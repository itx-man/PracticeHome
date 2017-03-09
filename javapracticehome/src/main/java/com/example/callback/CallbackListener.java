package com.example.callback;

/**
 * Created by 11041730 on 2017/3/7.
 *
 * 回调函数就是一个通过函数指针调用的函数。如果你把函数的指针（地址）
 * 作为参数传递给另一个函数，当这个指针被用为调用它所指向的函数时，我
 * 们就说这是回调函数。回调函数不是由该函数的实现方直接调用，而是在特
 * 定的事件或条件发生时由另外的一方调用的，用于对该事件或条件进行响应。
 * Java中没有指针的概念，通过接口和内部类的方式实现回调功能：
 *
 * 1.定义接口Callback,包含回调方法callback()
 * 2.在一个类Caller中声明一个Callback接口对象mCallback
 * 3.在程序中赋予Caller对象的接口成员(mCallback)一个内类对象如
 * new Callback() {
 *     callback() {
 *         //函数的具体实现
 *     }
 * }
 *这样，在需要的时候，可用Caller对象的mCallback接口成员，调用callback()
 * 方法，完成回调。
 *
 *
 * 回调机制在Android框架监听用户操作中的作用
 * Android时间侦听器是视图View类的接口，包含一个单独的回调方法。这些方法
 * 将在视图中注册的侦听器被用户界面操作触发时由Android框架调用。回调方法被
 * 包含在Android事件侦听器接口中：
 * 例如，Android的view对象都包含一个命名为OnClickListener接口成员变量，用户的
 * 点击操作都会交给OnClickListener的OnClick方法进行处理。
 * 开发者若需要对点击事件做处理，可以定义一个OnClickListener接口对象，赋给需要
 * 被点击的view的接口成员变量OnClickListener，一般是用view的setOnClickListener()
 * 函数来完成这一操作。
 * 当有用户点击事件时，系统就会回调被点击view的OnClickListener接口成员的OnClick
 * 方法。
 *
 */

