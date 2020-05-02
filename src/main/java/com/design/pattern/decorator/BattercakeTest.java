package com.design.pattern.decorator;

public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "，总价格：" + battercake.getPrice());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + ",总价格：" + battercakeWithEgg.getPrice());

        Battercake battercakeWithEggAdnSausage = new BattercakeWithEggAdnSausage();
        System.out.println(battercakeWithEggAdnSausage.getMsg() + ",总价格：" + battercakeWithEggAdnSausage.getPrice());
    }
}
