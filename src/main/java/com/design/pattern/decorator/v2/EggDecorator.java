package com.design.pattern.decorator.v2;

public class EggDecorator extends BattercakeDecorator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }


    @Override
    protected String getMsg() {
        return super.getMsg() + " + 1 个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}

