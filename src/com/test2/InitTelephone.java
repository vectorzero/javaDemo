package com.test2;

public class InitTelephone {
    public static void main(String[] args) {
        //无参的构造方法可以创建对象
        Telephone phone = new Telephone();
        //有参的构造方法也可以创建对象，并给对象中的实例赋初始值
        Telephone phone2 = new Telephone(5.0f,1.4f,2.0f);
    }
}
