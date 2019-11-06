package com.fredwang.demo.practicedesignpattern.singleton;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.singleton
 * @Author: FredWang
 * @DateTime: 2019-11-06 19:12
 * @Description: 饿汉式
 **/
public class Singleton {
    /**
     * 【应用场景】
     * 除了初始化单例类时 即 创建单例外，继续延伸出来的是：单例对象 要求初始化速度快 & 占用内存小
     */

    // 1. 加载该类时，单例就会自动被创建
    private static  Singleton ourInstance  = new  Singleton();

    // 2. 构造函数 设置为 私有权限
    // 原因：禁止他人创建实例
    private Singleton() {
    }

    // 3. 通过调用静态方法获得创建的单例
    public static  Singleton newInstance() {
        return ourInstance;
    }
}
