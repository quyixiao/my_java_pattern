package com.design.pattern.adapter.loginadapter;

public class PassportTest {

    public static void main(String[] args) {
        IPassportForThird iPassportForThird = new PassportForThirdAdapter();
        iPassportForThird.loginForQQ("");
    }
}
