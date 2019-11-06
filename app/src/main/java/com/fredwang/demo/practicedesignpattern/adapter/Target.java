package com.fredwang.demo.practicedesignpattern.adapter;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.adapter
 * @Author: FredWang
 * @DateTime: 2019-11-05 14:13
 * @Description: 适配器模式：目标接口
 **/
public interface Target {

    //将220V转换输出110V（原有插头（Adaptee）没有的）
    public void Convert_110v();

}
