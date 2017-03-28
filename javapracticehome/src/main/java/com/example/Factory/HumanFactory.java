package com.example.Factory;

/**
 * Created by 11041730 on 2017/3/28.
 * 目前女娲只有一个八卦炉，其实现了生产人类的方法，
 * 后续如果需要制造其他东西，可以扩展AbstractHumanFactory
 * 人类创建工厂
 */

public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        //定义一个生产的人种
        Human human = null;
        try {
            //生产一个人种
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
