package com.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ReplaceOverrideMethodInterceptor implements MethodInterceptor {


        public ReplaceOverrideMethodInterceptor() {
        }

        @Override
        public Object intercept(Object obj, Method method, Object[] args, MethodProxy mp) throws Throwable {
            System.out.println("======replace=====start=======================================");
            Object xxxx = mp.invokeSuper(obj, args);
            System.out.println("======replace=====end=======================================");
            return null;
        }
    }