package com.example.Factory;

/**
 * Created by 11041730 on 2017/3/28.
 */

public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();
        //第一次造人，火候不足，于是白人产生了
        System.out.println("The whiteman come out");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        //第二次造人，火候过了，于是黑人产生了
        System.out.println("The blackman come out");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        //第三次造人，火候刚刚好，于是黄种人产生了
        System.out.println("The yellowman come out");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
