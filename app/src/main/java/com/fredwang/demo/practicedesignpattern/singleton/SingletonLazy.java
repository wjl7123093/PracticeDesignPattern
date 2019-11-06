package com.fredwang.demo.practicedesignpattern.singleton;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.singleton
 * @Author: FredWang
 * @DateTime: 2019-11-06 19:16
 * @Description: 懒汉式
 **/
public class SingletonLazy {

    /**
     * 与 饿汉式 【最大的区别】是：单例创建的时机
     *
     * 饿汉式：单例创建时机不可控，即类加载时 【自动】创建 单例
     * 懒汉式：单例创建时机可控，即有需要时，才 【手动】创建 单例
     *
     * 【缺点】
     * 线程不安全，多线程不适用
     * 【原因】
     * 可能存在多个线程并发调用 newInstance(), 从而重复创建单例对象
     */

    // 1. 类加载时，先不自动创建单例
    //  即，将单例的引用先赋值为 Null
    private static  SingletonLazy ourInstance  = null;

    // 2. 构造函数 设置为 私有权限
    // 原因：禁止他人创建实例
    private SingletonLazy() {
    }

    // 3. 需要时才手动调用 newInstance（） 创建 单例
    public static  SingletonLazy newInstance() {
        // 先判断单例是否为空，以避免重复创建
        if( ourInstance == null){
            ourInstance = new SingletonLazy();
        }
        return ourInstance;
    }

}
