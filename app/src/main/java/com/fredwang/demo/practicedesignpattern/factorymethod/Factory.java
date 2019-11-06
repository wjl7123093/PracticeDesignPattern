package com.fredwang.demo.practicedesignpattern.factorymethod;

import com.fredwang.demo.practicedesignpattern.simplefactory.Product;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.factorymethod
 * @Author: FredWang
 * @DateTime: 2019-11-06 17:19
 * @Description:  创建抽象工厂类，定义具体工厂的公共接口
 **/
public abstract class Factory {

    /**
     * 【应用场景】
     * 1。当一个类不知道它所需要的对象的类时
     * 在工厂方法模式中，客户端不需要知道具体产品类的类名，只需要知道所对应的工厂即可；
     * 2。当一个类希望通过其子类来指定创建对象时
     * 在工厂方法模式中，对于抽象工厂类只需要提供一个创建产品的接口，而由其子类来确定具体要创建的对象，利用面向对象的多态性和里氏代换原则，在程序运行时，子类对象将覆盖父类对象，从而使得系统更容易扩展。
     * 3。将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无须关心是哪一个工厂子类创建产品子类，需要时再动态指定，可将具体工厂类的类名存储在配置文件或数据库中。
     *
     *
     * 【优点】
     * 1。更符合开-闭原则
     * 新增一种产品时，只需要增加相应的具体产品类和相应的工厂子类即可
     * 2。符合单一职责原则
     * 每个具体工厂类只负责创建对应的产品
     * 3。不使用静态工厂方法，可以形成基于继承的等级结构。
     *
     * 【缺点】
     * 1。添加新产品时，除了增加新产品类外，还要提供与之对应的具体工厂类，系统类的个数将成对增加，在一定程度上增加了系统的复杂度；同时，有更多的类需要编译和运行，会给系统带来一些额外的开销；
     * 2。由于考虑到系统的可扩展性，需要引入抽象层，在客户端代码中均使用抽象层进行定义，增加了系统的抽象性和理解难度，且在实现时可能需要用到DOM、反射等技术，增加了系统的实现难度。
     * 3。虽然保证了工厂方法内的对修改关闭，但对于使用工厂方法的类，如果要更换另外一种产品，仍然需要修改实例化的具体工厂类；
     * 4。一个具体工厂只能创建一种具体产品
     *
     */

    public abstract Product Manufacture();
}