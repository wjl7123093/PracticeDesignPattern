package com.fredwang.demo.practicedesignpattern.facade;

/**
 * @Package: com.fredwang.demo.practicedesignpattern
 * @Author: FredWang
 * @DateTime: 2019-11-05 09:49
 * @Description: 外观模式
 * 定义了一个高层、统一的接口，外部与通过这个统一的接口对子系统中的一群接口进行访问
 **/
public class FacadePattern {

    SubClass_Light light;
    SubClass_Tv tv;
    SubClass_AirConditioner airConditioner;

    public FacadePattern() {}

    public FacadePattern(SubClass_Light light, SubClass_Tv tv, SubClass_AirConditioner airConditioner) {
        this.light = light;
        this.tv = tv;
        this.airConditioner = airConditioner;
    }

    /**
     * 一键开电器
     */
    public void on() {
        System.out.println("起床了");
        this.light.on();
        this.tv.on();
        this.airConditioner.on();
    }

    /**
     * 一键关电器
     */
    public void off() {
        System.out.println("睡觉了");
        this.light.off();
        this.tv.off();
        this.airConditioner.off();
    }


    public static class SubClass_Light {
        public void on(){
            System.out.println("开灯。。");
        }
        public void off(){
            System.out.println("关灯。。");
        }
    }

    public static class SubClass_Tv {
        public void on(){
            System.out.println("开电视。。");
        }
        public void off(){
            System.out.println("关电视。。");
        }
    }

    public static class SubClass_AirConditioner {
        public void on(){
            System.out.println("打开空调。。");
        }
        public void off(){
            System.out.println("关掉空调。。");
        }
    }
}
