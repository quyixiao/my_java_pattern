package com.design.pattern.decorator.v2;

import com.design.pattern.delegate.Leader;

public class BattercakeTest {


    public static void main(String[] args) {
        Battercake battercake = new BaseBattercake();


        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());


        battercake = new EggDecorator(battercake);


        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getMsg() + ",总价格：" + battercake.getPrice());

    }

}
