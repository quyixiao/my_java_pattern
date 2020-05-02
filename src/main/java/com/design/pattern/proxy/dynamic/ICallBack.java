package com.design.pattern.proxy.dynamic;

import com.design.pattern.proxy.dynamic.ProxyDto;

public interface ICallBack {

    ProxyDto PROXY_DTO = new ProxyDto();


    default String callBack(){

        return "username";
    }


    default ProxyDto getData(){

        return PROXY_DTO;
    }
}
