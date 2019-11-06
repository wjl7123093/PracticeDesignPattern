package com.fredwang.demo.practicedesignpattern.template;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.template
 * @Author: FredWang
 * @DateTime: 2019-11-06 16:29
 * @Description: 创建具体模板（Concrete Class）”手撕包菜“ 的具体步骤
 **/
public class ConcreteBaoCai extends Template {
    @Override
    void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    void pourSauce() {
        System.out.println("下锅的酱料是辣");
    }
}
