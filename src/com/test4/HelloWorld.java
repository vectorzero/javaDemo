package com.test4;

public class HelloWorld {
    public class Inner {
        public void show() {
            System.out.println("我是渣渣辉，是个内部类的方法");
        }
    }
    public static void main(String[] args) {
        //创建外部类对象
        HelloWorld hello = new HelloWorld();
        //创建内部类对象
        Inner inner = hello.new Inner();
        inner.show();
    }
}