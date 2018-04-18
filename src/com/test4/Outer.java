package com.test4;

public class Outer {
    private int a = 6;//外部类的私有属性
    int c = 7;//外部类的成员属性
    public class Inner{
        int b = 5;//内部类的成员属性
        int c = 8;//内部类的同名成员属性
        public void show() {
            System.out.println("外部类的私有属性a:"+a);
            System.out.println("外部类的成员属性:"+Outer.this.c);
            System.out.println("内部类的成员属性:"+c);
            System.out.println("内部类的成员属性b:"+b);
        }
    }
    public static void main(String[] args) {
        //创建外部类对象
        Outer outer = new Outer();
        //创建内部类对象
        Inner inner = outer.new Inner();
        inner.show();
    }
}
