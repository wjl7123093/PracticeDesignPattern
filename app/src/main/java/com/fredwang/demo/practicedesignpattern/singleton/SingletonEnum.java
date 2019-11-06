package com.fredwang.demo.practicedesignpattern.singleton;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.singleton
 * @Author: FredWang
 * @DateTime: 2019-11-06 19:14
 * @Description: 枚举类型
 **/
public enum SingletonEnum {

    /**
     * 单元素的枚举类型已经成为实现 Singleton的最佳方法
     * 创建单例、线程安全、实现简洁的需求
     */

    //定义1个枚举的元素，即为单例类的1个实例
    INSTANCE;

    // 隐藏了1个空的、私有的 构造方法
    // private Singleton () {}
}
