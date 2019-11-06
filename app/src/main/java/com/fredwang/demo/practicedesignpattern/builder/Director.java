package com.fredwang.demo.practicedesignpattern.builder;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.builder
 * @Author: FredWang
 * @DateTime: 2019-11-06 11:18
 * @Description: 【背景：去电脑城组装电脑】电脑城老板委派任务给装机人员
 **/
public class Director {

    //指挥装机人员组装电脑
    public void Construct(Builder builder) {
        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
    }

}
