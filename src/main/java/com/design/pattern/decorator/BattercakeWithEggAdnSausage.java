package com.design.pattern.decorator;

public class BattercakeWithEggAdnSausage extends BattercakeWithEgg {

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 1 根香肠";
    }

    @Override
    // 加一根香肠 的钱
    public int getPrice() {
        return super.getPrice() + 2 ;
    }





}
