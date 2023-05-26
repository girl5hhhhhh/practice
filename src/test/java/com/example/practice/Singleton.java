package com.example.practice;

/**
 * @description: ����ģʽ
 * @author: chunyan.li
 * @time: 2023/5/25 17:36
 */
public class Singleton {
    /*//����ʽ-�̲߳���ȫ
    private static Singleton singleton;
    private Singleton(){};

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }*/

    /*//����ʽ���̰߳�ȫ
    private static Singleton singleton = new Singleton();
    private Singleton(){};

    public static Singleton getInstance(){
        return singleton;
    }*/

    //����ģʽ��˫����-�̰߳�ȫ
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
