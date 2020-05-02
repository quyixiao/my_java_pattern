package com.design.pattern.decorator.passport.old;

public class DecoratorTest {

    public static void main(String[] args) {
        SigninForThirdService signinForThirdService = new SigninForThirdServiceImpl(new SigninServiceImpl());
        signinForThirdService.login("","");
        signinForThirdService.loginForQQ("8ds9898ds89ds98");
    }
}
