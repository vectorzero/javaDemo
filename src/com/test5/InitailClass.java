package com.test5;

public class InitailClass {
    public static void main(String[] args) {
        //-》先执行初始化对象的属性再执行构造方法中的初始化
        Animal animal = new Animal();
        System.out.println("Animal的age:"+animal.age);
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.eat();
        dog.method();
        // 继承Object类
        // 返回对象的哈希code码(对象地址字符串)
        // 如果直接输出对象，就会执行toString()方法
        System.out.println(dog);
    }
}
