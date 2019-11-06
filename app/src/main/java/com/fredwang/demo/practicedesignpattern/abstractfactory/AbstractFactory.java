package com.fredwang.demo.practicedesignpattern.abstractfactory;

import com.fredwang.demo.practicedesignpattern.simplefactory.Product;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.abstractfactory
 * @Author: FredWang
 * @DateTime: 2019-11-06 17:28
 * @Description: 创建抽象工厂类，定义具体工厂的公共接口
 **/
public abstract class AbstractFactory {

    /**
     * 背景：小成有两间塑料加工厂（A厂仅生产容器类产品；B厂仅生产模具类产品）；随着客户需求的变化，A厂所在地的客户需要也模具类产品，B厂所在地的客户也需要容器类产品；
     * 冲突：没有资源（资金+租位）在当地分别开设多一家注塑分厂
     * 解决方案：在原有的两家塑料厂里增设生产需求的功能，即A厂能生产容器+模具产品；B厂间能生产模具+容器产品。
     *
     */

    /**
     * 【应用场景】
     * 1。一个系统不要求依赖产品类实例如何被创建、组合和表达的表达，这点也是所有工厂模式应用的前提。
     * 2。这个系统有多个系列产品，而系统中只消费其中某一系列产品
     * 3。系统要求提供一个产品类的库，所有产品以同样的接口出现，客户端不需要依赖具体实现。
     *
     *
     * 【优点】
     * 1。降低耦合
     * 抽象工厂模式将具体产品的创建延迟到具体工厂的子类中，这样将对象的创建封装起来，可以减少客户端与具体产品类之间的依赖，从而使系统耦合度低，这样更有利于后期的维护和扩展；
     * 2。更符合开-闭原则
     * 新增一种产品类时，只需要增加相应的具体产品类和相应的工厂子类即可
     * 3。符合单一职责原则
     * 每个具体工厂类只负责创建对应的产品
     * 4。不使用静态工厂方法，可以形成基于继承的等级结构。
     *
     * 【缺点】
     * 1。抽象工厂模式很难支持新种类产品的变化。
     * 这是因为抽象工厂接口中已经确定了可以被创建的产品集合，如果需要添加新产品，此时就必须去修改抽象工厂的接口，这样就涉及到抽象工厂类的以及所有子类的改变，这样也就违背了“开发——封闭”原则。
     *
     */

    public abstract Product ManufactureContainer();
    public abstract Product ManufactureMould();

}
