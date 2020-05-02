package com.design.pattern.adapter.loginadapter;

public class SigninForThirdService extends SiginService {


    public ResultMsg loginQQ(String openId){
        return login(openId,null);
    }


    public ResultMsg loginForWechat(String openId){
        return null;
    }


    public ResultMsg loginForTelphone(String telPhone,String code){
        return null;
    }



    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }



}
