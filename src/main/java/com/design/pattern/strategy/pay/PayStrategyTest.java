package com.design.pattern.strategy.pay;

public class PayStrategyTest {


    public static void main(String[] args) {
        // 省略把商品添加到购物车再从购物车中下单，直接从订单中开始

        //
        Order order = new Order("1", "1201803110010009", 324.45);

        System.out.println(order.pay());
    }
}
