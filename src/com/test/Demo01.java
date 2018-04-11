package com.test;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//创建Scanner对象
        System.out.print("请输入成绩:");
        int score = input.nextInt();
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
