package com.design.pattern.adapter.loginadapter;

public class LoginForTelAdapter implements LoginAdapter {


    @Override
    public ResultMsg login(Object ... values ) {
        System.out.println("手机号登陆");
        return null;
    }
}
