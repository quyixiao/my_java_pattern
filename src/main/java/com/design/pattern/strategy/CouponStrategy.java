package com.design.pattern.strategy;

public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格直接减免优惠券面值和抵扣");

    }
}
