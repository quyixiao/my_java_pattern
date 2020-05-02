package com.design.pattern.adapter.loginadapter;

public class LoginForWechatAdapter implements LoginAdapter {


    @Override
    public ResultMsg login(Object ... values ) {
        System.out.println("微信登陆");
        return null;
    }
}
