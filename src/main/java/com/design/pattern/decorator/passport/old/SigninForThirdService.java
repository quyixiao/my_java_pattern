package com.design.pattern.decorator.passport.old;

public interface SigninForThirdService extends SigninService {


    ResultMsg loginForQQ(String id);


    ResultMsg loginForWechat(String id);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelPhone(String telPhone, String code);


    ResultMsg loginForRegist(String username, String passport);


}
