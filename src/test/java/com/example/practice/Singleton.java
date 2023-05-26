package com.example.practice;

/**
 * @description: 单例模式
 * @author: chunyan.li
 * @time: 2023/5/25 17:36
 */
public class Singleton {
    /*//懒汉式-线程不安全
    private static Singleton singleton;
    private Singleton(){};

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }*/

    /*//饿汉式：线程安全
    private static Singleton singleton = new Singleton();
    private Singleton(){};

    public static Singleton getInstance(){
        return singleton;
    }*/

    //懒汉模式：双检锁-线程安全
    private volatile static Singleton singleton;
    private Singleton (){};

    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
