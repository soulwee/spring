package com.seecen;
/*
* 日志业务主键
* */
public class LogAspect {
    //开始记录日志
    public void beforeLog(){
        System.out.println("开始访问方法");
    }
    //结束记录日志
    public void afterLog(){
        System.out.println("结束访问方法");
    }
}
