package com.design.pattern.adapter.loginadapter;

public class LoginForTokenAdapter implements LoginAdapter {

    @Override
    public ResultMsg login(Object ... values )  {
        System.out.println("token登陆");
        return null;
    }
}
