package com.test;
//定义一个类
public class Telephone {
    //属性(成员变量)
    float screen;
    float cpu;
    float mem;
    //方法
    void call(){
        System.out.println("Telephone有打电话功能");
    }
    void sendMessage() {
        System.out.println("screen:"+screen+"cpu:"+cpu+"mem:"+mem+"Telephone有发短信的功能");
    }
}
