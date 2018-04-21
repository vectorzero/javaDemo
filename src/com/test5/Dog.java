package com.test5;

public class Dog extends Animal {
    //-》初始化父类再初始化子类
    public Dog() {
        System.out.println("Dog类执行了");
    }
    //方法的重写
    public void eat() {
        System.out.println("年龄"+age+"狗具有吃的能力");
    }
}
