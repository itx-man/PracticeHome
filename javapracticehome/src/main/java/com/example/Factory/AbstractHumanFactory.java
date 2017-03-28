package com.example.Factory;

/**
 * Created by 11041730 on 2017/3/28.
 * 定义一个八卦炉具有的功能，生产指令--给我生产一个黄色人种，
 * 只说明生产什么就可以了，不需要事物的具体信息。抽象人类创建工厂
 */

public abstract class AbstractHumanFactory {
    /*
     * 通过定义泛型对createHuman的输入参数产生两层限制
     * 必须是Class类型
     * 必须是Human的实现类
     */

    public abstract <T extends Human> T createHuman(Class<T> c);
}
