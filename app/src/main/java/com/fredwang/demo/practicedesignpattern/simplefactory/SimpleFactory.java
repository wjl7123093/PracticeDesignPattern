package com.fredwang.demo.practicedesignpattern.simplefactory;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.simplefactory
 * @Author: FredWang
 * @DateTime: 2019-11-06 16:57
 * @Description: 创建工厂类，通过创建静态方法从而根据传入不同参数创建不同具体产品类的实例
 **/
public class SimpleFactory {

    /**
     * 【应用场景】
     * 1。客户如果只知道传入工厂类的参数，对于如何创建对象的逻辑不关心时；
     * 2。当工厂类负责创建的对象（具体产品）比较少时。
     *
     * 【优点】
     * 1。将创建实例的工作与使用实例的工作分开，使用者不必关心类对象如何创建，实现了解耦；
     * 2。把初始化实例时的工作放到工厂里进行，使代码更容易维护。 更符合面向对象的原则 & 面向接口编程，而不是面向实现编程。
     *
     * 【缺点】
     * 1。工厂类集中了所有实例（产品）的创建逻辑，一旦这个工厂不能正常工作，整个系统都会受到影响；
     * 2。违背“开放 - 关闭原则”，一旦添加新产品就不得不修改工厂类的逻辑，这样就会造成工厂逻辑过于复杂。
     * 3。简单工厂模式由于使用了静态工厂方法，静态方法不能被继承和重写，会造成工厂角色无法形成基于继承的等级结构。
     *
     *
     */

    // 工厂类静态方法
    public static Product Manufacture(String ProductName){
        //工厂类里用switch语句控制生产哪种商品；
        //使用者只需要调用工厂类的静态方法就可以实现产品类的实例化。
        switch (ProductName){
            case "A":
                return new ProductA();

            case "B":
                return new ProductB();

            case "C":
                return new ProductC();

            default:
                return null;

        }
    }

}
