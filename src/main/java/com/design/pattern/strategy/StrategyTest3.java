package com.design.pattern.strategy;

public class StrategyTest3 {

    public static void main(String[] args) {

        String promoteKey = "COUPON";

        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promoteKey);
        PromotionActivity promotionActivity = new PromotionActivity(promotionStrategy);
        promotionActivity.execute();
    }
}
