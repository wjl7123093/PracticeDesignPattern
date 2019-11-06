package com.fredwang.demo.practicedesignpattern.abstractfactory;

import com.fredwang.demo.practicedesignpattern.simplefactory.Product;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.abstractfactory
 * @Author: FredWang
 * @DateTime: 2019-11-06 18:41
 * @Description: 创建具体工厂类（继承抽象工厂类），定义创建对应具体产品实例的方法
 **/
public class ConcreteFactoryB extends AbstractFactory {
    //B厂 - 生产模具+容器产品

    @Override
    public Product ManufactureContainer() {
        return new ContainerProductB();
    }

    @Override
    public Product ManufactureMould() {
        return new MouldProductB();
    }
}
