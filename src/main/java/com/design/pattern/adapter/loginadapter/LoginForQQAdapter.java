package com.design.pattern.adapter.loginadapter;

public class LoginForQQAdapter implements LoginAdapter {

    @Override
    public ResultMsg login(Object ... values ) {
        System.out.println("QQ登陆");
        return null;
    }
}
