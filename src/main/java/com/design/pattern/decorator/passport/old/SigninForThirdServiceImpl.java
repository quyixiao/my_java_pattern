package com.design.pattern.decorator.passport.old;

public class SigninForThirdServiceImpl implements SigninForThirdService {

    private SigninService signin;


    public SigninForThirdServiceImpl(SigninService signin) {
        this.signin = signin;
    }

    @Override
    public ResultMsg regist(String username, String paaword) {
        return signin.regist(username,paaword);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signin.login(username,password);
    }


    @Override
    public ResultMsg loginForQQ(String id) {

        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelPhone(String telPhone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }


}
