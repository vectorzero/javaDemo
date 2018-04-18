package com.test4;

//静态内部类
public class SOuter {
    private int a = 5; //外部类私有变量
    static int b = 4; //外部类静态变量
    public static class SInner {
        int b = 3; //内部类变量
        public void show() {
            System.out.println("外私a:" + new SOuter().a);
            System.out.println("外静态b:" + SOuter.b);
            System.out.println("内b:" + b);
        }
    }
    public static void main(String[] args) {
        //直接创建静态内部类对象
        SInner sInner = new SInner();
        sInner.show();
    }
}
