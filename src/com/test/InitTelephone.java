package com.test;

public class InitTelephone {
    public static void main(String[] args) {
        //创建对象
        Telephone phone = new Telephone();
        //使用对象的方法
        phone.sendMessage();
        //使用对象的属性并赋值
        phone.screen = 1.4f;
        phone.cpu = 2.5f;
        phone.mem = 4.6f;
        phone.sendMessage();
    }
}
