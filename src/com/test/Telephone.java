package com.test;
//定义一个类
public class Telephone {
    //属性(成员变量)
    float screen;
    float cpu;
    float mem;
    int varVal;
    //方法
    void call(){
        //成员变量&局部变量
        //成员变量:在类中定义；类中的所有方法都能用；默认初始值为0；
        //局部变量:在方法中定义；只有该方法可用；没有初始值；
        //两类变量同名时，局部变量优先级高于成员变量
        int localVal = 0;
        System.out.println("localVal:"+localVal);
        System.out.println("var1:"+varVal);//默认的成员变量的值为0
        System.out.println("Telephone有打电话功能");
    }
    void sendMessage() {
        System.out.println("var2:"+varVal);
        System.out.println("screen:"+screen+"cpu:"+cpu+"mem:"+mem+"Telephone有发短信的功能");
    }
}
