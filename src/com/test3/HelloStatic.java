package com.test3;

public class HelloStatic {
    int num1;//声明变量num1
    int num2;//声明变量num2
    static int num3;//声明静态变量num3;
    public HelloStatic() {//构造方法
        num1 = 91;
        System.out.println("通过构造方法为num1赋值");
    }
    {//初始化块
        num2 = 88;
        System.out.println("通过初始化块为num2赋值");
    }
    static {//静态初始化块
        //静态初始化块只会在类加载时执行，且只会执行一次
        //只能给静态变量赋值，不能初始化普通的成员变量
        num3 = 66;
        System.out.println("通过静态初始化块为num3赋值");
    }
    public static void main(String[] args) {
        HelloStatic hello = new HelloStatic();
        System.out.println("num1:"+ hello.num1);
        System.out.println("num2"+hello.num2);
        System.out.println("num3"+num3);
        HelloStatic hello2 = new HelloStatic();
    }
}
