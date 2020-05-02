package com.design.pattern.proxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibOrgin {
    public static void main(String[] args) throws Exception{
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/quyixiao/git/my_spring5/src/main/java/com/design/pattern/proxy/cglib/");
        Customer obj = (Customer) new CglibMeipo().getInstance(Customer.class);
        obj.findLove();
    }
}
