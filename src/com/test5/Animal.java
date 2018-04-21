package com.test5;

public class Animal {
    public int age = 10;
    public String name;
    public void eat() {
        System.out.println("动物具有吃的能力");
    }
    //初始化父类再初始化子类-》
    public Animal() {
        System.out.println("Animal类执行了");
        //先执行初始化对象的属性再执行构造方法中的初始化-》
        age = 20;
    }
}
