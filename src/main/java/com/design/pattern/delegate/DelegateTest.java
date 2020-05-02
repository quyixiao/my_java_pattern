package com.design.pattern.delegate;

public class DelegateTest {

    public static void main(String[] args) {
        // 代理模式注重的是过程，委派模式注重的是结果
        // 策略模式注重的是可扩展，委派模式注重的是内部的灵活性和可复用性
        // 委派模式的核心就是开发，调试，派遣，委派模式是静态代理和策略模式的一种特殊组合
        new Boos().command("登陆",new Leader());
    }
}
