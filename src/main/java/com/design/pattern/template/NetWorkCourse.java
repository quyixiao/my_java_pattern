package com.design.pattern.template;

public abstract class NetWorkCourse {



    protected final void createCourse(){
        this.postPreResource();


        this.createPPt();

        this.liveVideo();

        this.postSource();

        if(needHomeWork()){
            checkHomeWork();
        }
    }



    abstract void checkHomeWork();

    protected boolean needHomeWork(){
        return false;
    }

    final void postSource(){
        System.out.println("提交源代码");
    }

    final void postNote(){
        System.out.println("提交课件和笔记");
    }

    final void liveVideo(){
        System.out.println("直播授课");
    }

    final void createPPt(){
        System.out.println("创建备课PPT");
    }

    final void postPreResource(){
        System.out.println("分发预习资料");
    }

}
