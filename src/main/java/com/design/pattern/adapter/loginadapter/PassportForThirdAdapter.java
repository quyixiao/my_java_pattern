package com.design.pattern.adapter.loginadapter;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(LoginForQQAdapter.class, id);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(LoginForWechatAdapter.class, id);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(LoginForTokenAdapter.class, token);
    }

    @Override
    public ResultMsg loginforTelphone(String telPhone, String code) {
        return processLogin(LoginForTelAdapter.class, telPhone, code);
    }

    @Override
    public ResultMsg loginForRegister(String username, String password) {
        super.regist(username, password);
        return super.login(username, password);
    }

    private ResultMsg processLogin(Class<? extends LoginAdapter> clazz, String... values) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            return adapter.login(adapter, values);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
