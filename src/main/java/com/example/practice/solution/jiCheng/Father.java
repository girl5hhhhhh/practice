package com.example.practice.solution.jiCheng;

/**
 * @description:
 * @author: chunyan.li
 * @time: 2022/9/26 23:14
 */
public class Father {
    public static void main(String[] args) {
        Son s = new Son();
        s.sayHello();
    }
    public void sayHello() {
        System.out.println("Hello");
    }
}
