package com.gupaoedu.demo.mvc.action;

import com.design.pattern.utils.LogUtils;
import com.gupaoedu.demo.service.DemoService;
import com.gupaoedu.mvcframework.annotation.GPAutowired;
import com.gupaoedu.mvcframework.annotation.GPController;
import com.gupaoedu.mvcframework.annotation.GPRequestMapping;
import com.gupaoedu.mvcframework.annotation.GPRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@GPController
@GPRequestMapping("/demo")
public class DemoAction {
    @GPAutowired
    private DemoService demoService;



    @GPRequestMapping("/query")
    public void query(HttpServletRequest req, HttpServletResponse resp, @GPRequestParam("name") String name) {
        String result = demoService.get(name);
        try {
            LogUtils.info(" query name is :" + result);
            resp.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @GPRequestMapping("/add")
    public void add(HttpServletRequest req, HttpServletResponse resp, @GPRequestParam("a") Integer a,
                    @GPRequestParam("b") Integer b) {
        try {
            resp.getWriter().write(a + " + " + b + " = " + (a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @GPRequestMapping("/remove")
    public void remove(HttpServletRequest req, HttpServletResponse resp, @GPRequestParam("id") Integer id) {


    }
}

