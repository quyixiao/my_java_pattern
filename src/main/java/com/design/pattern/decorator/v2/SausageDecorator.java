package com.design.pattern.decorator.v2;

public class SausageDecorator extends BattercakeDecorator {

    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }


    @Override
    protected String getMsg() {
        return super.getMsg() + "+ 1 根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
