package com.design.pattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LookupOverrideMethodInterceptor  implements MethodInterceptor {


		public LookupOverrideMethodInterceptor() {

		}

		@Override
		public Object intercept(Object obj, Method method, Object[] args, MethodProxy mp) throws Throwable {
			System.out.println("======lookup=====start=======================================");
			Object xxxx = mp.invokeSuper(obj, args);
			System.out.println("======lookup=====end=======================================");
			return null;
		}
	}

