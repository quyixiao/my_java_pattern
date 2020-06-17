package com.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class MethodOverrideCallbackFilter implements CallbackFilter {

    private int a;

    public MethodOverrideCallbackFilter(int a) {
        this.a = a;
    }

    @Override
    public int accept(Method method) {

        return a;
    }

}