package com.design.pattern.adapter.loginadapter;

public interface IPassportForThird {


    ResultMsg loginForQQ(String id);


    ResultMsg loginForWechat(String id);


    ResultMsg loginForToken(String token);

    ResultMsg loginforTelphone(String telPhone, String code);


    ResultMsg loginForRegister(String username, String password);


}
