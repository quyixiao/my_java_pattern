package com.design.pattern.proxy.cglib;

public class CglibTest {

    public static void main(String[] args)  throws Exception{
        Customer obj = (Customer) new CglibMeipo().getInstance(Customer.class);
        obj.findLove();
    }
}
