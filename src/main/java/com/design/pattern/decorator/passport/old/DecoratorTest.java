package com.design.pattern.decorator.passport.old;

// 装饰者模式本质的特征是将原有的类附加功能抽离出来，简化原有的类的逻辑，通过这个案例可以总结出装饰都模式是
// 可有可无的，具体可以根据业务模型来选择
public class DecoratorTest {


    public static void main(String[] args) {
        SigninForThirdService signinForThirdService = new SigninForThirdServiceImpl(new SigninServiceImpl());
        signinForThirdService.login("", "");
        signinForThirdService.loginForQQ("8ds9898ds89ds98");
    }
}
