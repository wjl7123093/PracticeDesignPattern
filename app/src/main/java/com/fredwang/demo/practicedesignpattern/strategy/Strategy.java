package com.fredwang.demo.practicedesignpattern.strategy;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.strategy
 * @Author: FredWang
 * @DateTime: 2019-11-06 15:49
 * @Description: 定义抽象策略角色（Strategy）：百货公司所有促销活动的共同接口
 **/
public abstract class Strategy {

    /**
     * 背景：小成有一家百货公司，最近在定年度的促销活动
     * 冲突：每个节日用同一个促销活动太枯燥，没吸引力
     * 解决方案：针对不同节目使用不同促销活动进行促销
     */

    /**
     * 【应用场景】
     * 动态选择多种复杂行为。
     * 该行为可理解为：
     *
     * 复杂的算法 / 数据结构
     * 类的行为 / 方法
     * 注：提高了行为的保密
     *
     * 【优点】
     * 1。策略类之间可以自由切换
     * 由于策略类都实现同一个接口，所以使它们之间可以自由切换。
     * 2。易于扩展
     * 增加一个新的策略只需要添加一个具体的策略类即可，基本不需要改变原有的代码，符合“开闭原则“
     * 3。避免使用多重条件选择语句（if else），充分体现面向对象设计思想。
     *
     * 【缺点】
     * 1。客户端必须知道所有的策略类，并自行决定使用哪一个策略类。
     * 2。策略模式将造成产生很多策略类，可以通过使用享元模式在一定程度上减少对象的数量。
     */

    public abstract void show();

}
