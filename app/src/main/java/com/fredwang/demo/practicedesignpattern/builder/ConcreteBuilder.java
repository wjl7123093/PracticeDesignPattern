package com.fredwang.demo.practicedesignpattern.builder;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.builder
 * @Author: FredWang
 * @DateTime: 2019-11-06 11:21
 * @Description: 【背景：去电脑城组装电脑】装机人员1
 **/
public class ConcreteBuilder extends Builder {
    //创建产品实例
    Computer computer = new Computer();

    //组装产品
    @Override
    public void  BuildCPU(){
        computer.Add("组装CPU");
    }

    @Override
    public void  BuildMainboard(){
        computer.Add("组装主板");
    }

    @Override
    public void  BuildHD(){
        computer.Add("组装硬盘");
    }

    //返回组装成功的电脑
    @Override
    public  Computer getComputer(){
        return computer;
    }
}
