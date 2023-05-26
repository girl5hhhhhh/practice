package com.example.practice;

/**
 * @description: 死锁
 * @author: chunyan.li
 * @time: 2023/5/26 14:55
 */
public class DeadLockTest  {
    public static void main(String[] args) {
        Object A = new Object();
        Object B = new Object();

        Thread threadA = new Thread(() -> {
            synchronized (A){
                System.out.println(Thread.currentThread().getName()+"持有A锁，希望获得B锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(B){
                    System.out.println(Thread.currentThread().getName()+"获取B锁成功");
                }
            }
        },"A");

        Thread threadB = new Thread(() -> {
            synchronized (B){
                System.out.println(Thread.currentThread().getName()+"持有B锁，希望获得A锁");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(A){
                    System.out.println(Thread.currentThread().getName()+"获取A锁成功");
                }
            }
        },"B");

        threadA.start();
        threadB.start();
    }
}
