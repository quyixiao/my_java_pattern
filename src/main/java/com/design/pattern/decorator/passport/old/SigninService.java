package com.design.pattern.decorator.passport.old;

public interface SigninService {
    ResultMsg regist(String username, String paaword);

    ResultMsg login(String username, String password);
}
