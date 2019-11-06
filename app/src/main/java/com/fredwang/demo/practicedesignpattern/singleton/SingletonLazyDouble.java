package com.fredwang.demo.practicedesignpattern.singleton;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.singleton
 * @Author: FredWang
 * @DateTime: 2019-11-06 19:26
 * @Description: 双重校验锁（懒汉式的改进）
 **/
public class SingletonLazyDouble {

    /**
     * 【原理】
     * 在同步锁的基础上，添加1层 if判断：若单例已创建，则不需再执行加锁操作就可获取实例，从而提高性能
     *
     */

    private static  SingletonLazyDouble ourInstance  = null;

    private SingletonLazyDouble() {
    }

    public static  SingletonLazyDouble newInstance() {
        // 加入双重校验锁
        // 校验锁1：第1个if
        if( ourInstance == null){  // ①
            synchronized (SingletonLazyDouble.class){ // ②
                // 校验锁2：第2个 if
                if( ourInstance == null){
                    ourInstance = new SingletonLazyDouble();
                }
            }
        }
        return ourInstance;
    }

    // 说明
    // 校验锁1：第1个if
    // 作用：若单例已创建，则直接返回已创建的单例，无需再执行加锁操作
    // 即直接跳到执行 return ourInstance

    // 校验锁2：第2个 if
    // 作用：防止多次创建单例问题
    // 原理
    // 1. 线程A调用newInstance()，当运行到②位置时，此时线程B也调用了newInstance()
    // 2. 因线程A并没有执行instance = new Singleton();，此时instance仍为空，因此线程B能突破第1层 if 判断，运行到①位置等待synchronized中的A线程执行完毕
    // 3. 当线程A释放同步锁时，单例已创建，即instance已非空
    // 4. 此时线程B 从①开始执行到位置②。此时第2层 if 判断 = 为空（单例已创建），因此也不会创建多余的实例

}
