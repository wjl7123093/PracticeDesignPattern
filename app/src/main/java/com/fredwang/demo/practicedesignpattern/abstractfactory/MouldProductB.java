package com.fredwang.demo.practicedesignpattern.abstractfactory;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.abstractfactory
 * @Author: FredWang
 * @DateTime: 2019-11-06 18:40
 * @Description: 创建具体产品类（继承抽象产品类）， 定义生产的具体产品
 **/
public class MouldProductB extends MouldProduct {
    //模具产品B类

    @Override
    public void show() {
        System.out.println("生产出了模具产品B");
    }
}
