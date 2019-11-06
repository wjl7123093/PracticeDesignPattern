package com.fredwang.demo.practicedesignpattern.template;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.template
 * @Author: FredWang
 * @DateTime: 2019-11-06 16:31
 * @Description: 创建具体模板（Concrete Class）,即 ”蒜蓉炒菜心“ 的具体步骤
 **/
public class ConcreteCaiXin extends Template {
    @Override
    void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    void pourSauce() {
        System.out.println("下锅的酱料是蒜");
    }
}
