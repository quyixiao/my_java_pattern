package com.design.pattern.adapter.loginadapter;

public class LoginForSinaAdapter implements LoginAdapter {

    @Override
    public ResultMsg login(Object ... values )  {
        System.out.println("Sina登陆");
        return null;
    }
}
