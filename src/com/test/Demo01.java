package com.test;

public class Demo01 {
    public static void main(String[] args) {
        int score = 54;
        int count = 0;
        System.out.println("加分前的成绩:" + score);
        while(score < 60) {
            score++;
            count++;
        }
        System.out.println("加分后的成绩:" + score);
        System.out.println("加分次数:" + count);
    }
}
