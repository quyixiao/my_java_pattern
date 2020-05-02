package com.design.pattern.decorator.passport.old;

public class SigninServiceImpl implements SigninService {
    @Override
    public ResultMsg regist(String username, String paaword) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        System.out.println("登录成功");
        return new ResultMsg(200, "登录成功", new Member());
    }
}
