package com.design.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent2 {

    @Subscribe
    public void subscribe2(String str) {




        System.out.println("执行sbscribe2 方法，传入的参数是" + str);
    }










}
