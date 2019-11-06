package com.fredwang.demo.practicedesignpattern.simplefactory;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.simplefactory
 * @Author: FredWang
 * @DateTime: 2019-11-06 16:56
 * @Description: 创建具体产品类（继承抽象产品类），定义生产的具体产品
 **/
public class ProductB extends Product {
    @Override
    public void show() {
        System.out.println("生产出了产品B");

    }
}
