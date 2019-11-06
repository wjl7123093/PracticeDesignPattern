package com.fredwang.demo.practicedesignpattern.strategy;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.strategy
 * @Author: FredWang
 * @DateTime: 2019-11-06 15:55
 * @Description: 定义具体策略角色（Concrete Strategy）：每个节日具体的促销活动
 **/
public class StrategyB extends Strategy {
    @Override
    public void show() {
        System.out.println("为中秋节准备的促销活动B");
    }
}
