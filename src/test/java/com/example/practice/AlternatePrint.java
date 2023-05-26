package com.example.practice;

/**
 * @description: 交替打印：两个线程争这同一把锁
 * @author: chunyan.li
 * @time: 2023/5/26 18:05
 */
public class AlternatePrint {

    static class PrintNum extends Thread {
        static int num = 1;
        // 静态成员变量，保证锁的唯一
        static Object obj = new Object();
        public void run() {
            while (true) {
                //obj can instead of PrintNum.class
                synchronized (obj) {
                    /*当前线程活动期间才能唤醒其他等待线程*/
                    obj.notify();
                    if (num <= 100) {
                        try {
                            Thread.currentThread().sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + ":" + num);
                        num++;
                    } else {
                        break;
                    }

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Thread t1 = new PrintNum();
        Thread t2 = new PrintNum();

        t1.setName("thread1");
        t2.setName("thread2");
        t1.setPriority(Thread.MAX_PRIORITY);//10
        t2.setPriority(Thread.MIN_PRIORITY);//1

        t1.start();
        t2.start();
    }

}
