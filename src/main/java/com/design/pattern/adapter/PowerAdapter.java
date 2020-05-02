package com.design.pattern.adapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;

    }


    public int outputDC5V() {
        int adapterInput = ac220.outputAC220();
        int adpterOutput = adapterInput / 44;
        System.out.println("使用PowerAdatater输入AC:" + adapterInput + "V 输出DC:" + adpterOutput + "V");
        return adpterOutput;
    }
}
