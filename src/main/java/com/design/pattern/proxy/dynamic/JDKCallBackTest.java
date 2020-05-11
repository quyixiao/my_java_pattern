package com.design.pattern.proxy.dynamic;

public class JDKCallBackTest {

    public static void main(String[] args) {
        try {
            ICallBack iCallBackxx = (ICallBack) new JDKCallBack().getInstance(new ICallBack() {
                @Override
                public String callBack() {
                    this.PROXY_DTO.setUsername("张三");
                    return "xxxxxxxxx";
                }
            });
            iCallBackxx.callBack();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
