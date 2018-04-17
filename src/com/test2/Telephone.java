package com.test2;

public class Telephone {
    private float screen;
    private float cpu;
    private float mem;
    //无参的构造方法
    public Telephone() {
        System.out.println("无参的构造方法执行了");
    }
    //有参的构造方法
    public Telephone(float newScreen,float newCpu, float newMem) {
        if(newScreen < 3.5f) {
            System.out.println("您输入的值有问题");
            screen = 3.5f;
        }else {
            screen = newScreen;
        }
        cpu = newCpu;
        mem = newMem;
        System.out.println("有参的构造方法执行了");
    }
}
