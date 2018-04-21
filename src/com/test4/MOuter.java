package com.test4;

public class MOuter {
    public void show() {
        final int a = 6; //常量
        int b = 7; //变量
        class MInner {
            int c = 4; //内部类变量
            public void print() {
                System.out.println("外部类方法中的常量a:"+a);
                System.out.println("内部类的变量b:"+b);
            }
        }
        MInner mInner = new MInner(); //创建方法内部类的对象
        mInner.print(); //调用内部类的方法
    }
    public static void main (String[] args) {
        MOuter mOuter = new MOuter(); //创建外部类的对象
        mOuter.show(); //调用外部类的方法
    }
}
