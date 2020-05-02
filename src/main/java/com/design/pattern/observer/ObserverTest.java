package com.design.pattern.observer;

public class ObserverTest {

    public static void main(String[] args) throws Exception {
        Gper gper = Gper.getInstance();
        Teacher tom = new Teacher("tom");
        Teacher mic = new Teacher("mic");

        gper.addObserver(tom);
        gper.addObserver(mic);

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察设计模式适用哪些场景！");
        gper.publishQuestion(question);

    }
}
