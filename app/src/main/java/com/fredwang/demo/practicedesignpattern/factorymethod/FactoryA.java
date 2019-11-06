package com.fredwang.demo.practicedesignpattern.factorymethod;

import com.fredwang.demo.practicedesignpattern.simplefactory.Product;
import com.fredwang.demo.practicedesignpattern.simplefactory.ProductA;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.factorymethod
 * @Author: FredWang
 * @DateTime: 2019-11-06 17:20
 * @Description: 创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法
 **/
public class FactoryA extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductA();
    }
}
