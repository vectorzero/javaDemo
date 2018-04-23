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
    }
}
