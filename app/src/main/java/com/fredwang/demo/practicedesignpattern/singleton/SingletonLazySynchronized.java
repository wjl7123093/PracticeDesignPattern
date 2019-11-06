package com.fredwang.demo.practicedesignpattern.singleton;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.singleton
 * @Author: FredWang
 * @DateTime: 2019-11-06 19:21
 * @Description: 同步锁（懒汉式改进）
 **/
public class SingletonLazySynchronized {

    /**
     * 【原理】
     * 使用同步锁 synchronized锁住 创建单例的方法 ，防止多个线程同时调用，从而避免造成单例被多次创建
     *
     * 【缺点】
     * 每次访问都要进行线程同步（即 调用synchronized锁)，造成过多的同步开销（加锁 = 耗时、耗能）
     */

    // 1. 类加载时，先不自动创建单例
    //  即，将单例的引用先赋值为 Null
    private static  SingletonLazySynchronized ourInstance  = null;

    // 2. 构造函数 设置为 私有权限
    // 原因：禁止他人创建实例
    private SingletonLazySynchronized() {
    }

    // 3. 加入同步锁
    // 第一种写法
    public static synchronized SingletonLazySynchronized getInstance(){
        // 先判断单例是否为空，以避免重复创建
        if ( ourInstance == null )
            ourInstance = new SingletonLazySynchronized();
        return ourInstance;
    }

    // 第二种写法
    /*public static SingletonLazySynchronized getInstance(){
        // 加入同步锁
        synchronized(SingletonLazySynchronized.class) {
            if (ourInstance == null)
                ourInstance = new SingletonLazySynchronized();
        }
        return ourInstance;
    }*/

}
