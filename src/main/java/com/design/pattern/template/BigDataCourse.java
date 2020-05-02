package com.design.pattern.template;

public class BigDataCourse extends NetWorkCourse {


    private boolean needHomeworkFlag = true;

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据作业");
    }

    @Override
    protected boolean needHomeWork() {
        return this.needHomeworkFlag;
    }


}
