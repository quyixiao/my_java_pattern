package com.gupaoedu.demo.service.impl;

import com.gupaoedu.demo.service.DemoService;
import com.gupaoedu.mvcframework.annotation.GPService;

@GPService
public class DemoServiceImpl implements DemoService {
    @Override
    public String get(String name) {
        return "My name is " + name;
    }
}
