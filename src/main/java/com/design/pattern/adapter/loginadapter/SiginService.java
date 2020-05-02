package com.design.pattern.adapter.loginadapter;

public class SiginService {


    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }


    public ResultMsg login(String username, String password) {
        return null;
    }
}
