package com.fredwang.demo.practicedesignpattern.abstractfactory;

import com.fredwang.demo.practicedesignpattern.simplefactory.Product;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.abstractfactory
 * @Author: FredWang
 * @DateTime: 2019-11-06 17:31
 * @Description: 创建抽象产品类 ，定义具体产品的公共接口；
 **/
public abstract class MouldProduct extends Product {
    @Override
    public abstract void show();
}
