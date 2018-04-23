package com.test5;

public class Dog extends Animal {
    public int age = 16;
    //-》初始化父类再初始化子类
    public Dog() {
        System.out.println("Dog类执行了");
    }
    //方法的重写
    public void eat() {
        System.out.println("年龄"+age+"狗具有吃的能力");
    }
    //super
    public void method() {
        System.out.println("子类的age:"+age);
        //调用父类的属性
        System.out.println("父类的age:"+super.age);
        //调用父类的方法
        super.eat();
    }
}
