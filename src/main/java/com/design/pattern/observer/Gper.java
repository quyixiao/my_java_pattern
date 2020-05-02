package com.design.pattern.observer;


import java.util.Observable;

public class Gper extends Observable {


    private String name = "GPer 生态圈";

    private static Gper gper = null;


    private Gper(){

    }

    public static Gper getInstance(){
        if(null == gper){

            return new Gper();
        }
        return gper;
    }


    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.getName() + " 上提交了一个问题 " );
        setChanged();
        notifyObservers(question);
    }
}
