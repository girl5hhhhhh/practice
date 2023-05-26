package com.example.practice;

/**
 * @description: ����
 * @author: chunyan.li
 * @time: 2023/5/26 14:55
 */
public class DeadLockTest  {
    public static void main(String[] args) {
        Object A = new Object();
        Object B = new Object();

        Thread threadA = new Thread(() -> {
            synchronized (A){
                System.out.println(Thread.currentThread().getName()+"����A����ϣ�����B��");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(B){
                    System.out.println(Thread.currentThread().getName()+"��ȡB���ɹ�");
                }
            }
        },"A");

        Thread threadB = new Thread(() -> {
            synchronized (B){
                System.out.println(Thread.currentThread().getName()+"����B����ϣ�����A��");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(A){
                    System.out.println(Thread.currentThread().getName()+"��ȡA���ɹ�");
                }
            }
        },"B");

        threadA.start();
        threadB.start();
    }
}
