package com.fredwang.demo.practicedesignpattern.adapter;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.adapter
 * @Author: FredWang
 * @DateTime: 2019-11-05 14:30
 * @Description: 适配器模式：源类
 **/
public class PowerPort220V {

    //原有插头只能输出220V
    public void Output_220v(){
        System.out.println("输出220v");
    }
}
