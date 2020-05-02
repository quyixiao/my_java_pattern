package com.design.pattern.strategy;

public class StrategyTest2 {

    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promoteKey = "COUPON";

        if(promoteKey.equals("COUPON")){
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        }
        promotionActivity.execute();
    }
}
