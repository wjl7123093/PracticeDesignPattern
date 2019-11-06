package com.fredwang.demo.practicedesignpattern.proxy;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.proxy
 * @Author: FredWang
 * @DateTime: 2019-11-06 11:56
 * @Description: 创建真实对象类（RealSubject）,即”我“
 **/
public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台 Mac");
    }
}
