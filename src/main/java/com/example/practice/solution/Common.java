package com.example.practice.solution;

/**
 * @description: 常见java编程题
 * @author: chunyan.li
 * @time: 2023/6/14 16:24
 */
public class Common {
    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }

    /**
     * 1+2+3+...+100 的和
     */
    private static void test1() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * 输出以下九九乘法表
     * 1 * 1 = 1
     * 2 * 1 = 2	2 * 2 = 4
     * 3 * 1 = 3	3 * 2 = 6	3 * 3 = 9
     */
    private static void test2() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.print("\n");
        }
    }

    /**
     * 100层楼和两个玻璃球
    */
    private static void test3() {
        
    }
}
