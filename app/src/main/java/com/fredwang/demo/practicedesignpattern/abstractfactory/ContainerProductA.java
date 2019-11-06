package com.fredwang.demo.practicedesignpattern.abstractfactory;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.abstractfactory
 * @Author: FredWang
 * @DateTime: 2019-11-06 18:38
 * @Description:  创建具体产品类（继承抽象产品类）， 定义生产的具体产品
 **/
public class ContainerProductA extends ContainerProduct {
    //容器产品A类

    @Override
    public void show() {

        System.out.println("生产出了容器产品A");
    }
}
