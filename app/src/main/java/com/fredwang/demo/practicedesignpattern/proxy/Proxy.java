package com.fredwang.demo.practicedesignpattern.proxy;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.proxy
 * @Author: FredWang
 * @DateTime: 2019-11-06 11:55
 * @Description: 创建代理对象类（Proxy），即”代购“，并通过代理类创建真实对象实例并访问其方法
 **/
public class Proxy implements Subject {

    /**
     * 背景：小成希望买一台最新的顶配Mac电脑
     * 冲突：国内还没上，只有美国才有
     * 解决方案：寻找代购进行购买
     */

    /**
     * 【应用场景】
     * 1。远程代理
     * 2。虚拟代理
     * 3。保护代理
     * 4。智能引用代理
     * 5。其余（防火墙代理，Cache 代理）
     *
     * 【优点】
     * 1。协调调用者和被调用者，降低了系统的耦合度
     * 2。代理对象作为客户端和目标对象之间的中介，起到了保护目标对象的作用
     *
     * 【缺点】
     * 1。由于在客户端和真实主题之间增加了代理对象，因此会造成请求的处理速度变慢；
     * 2。实现代理模式需要额外的工作（有些代理模式的实现非常复杂），从而增加了系统实现的复杂度。
     */

    @Override
    public void buyMac() {
        //引用并创建真实对象实例，即”我“
        RealSubject realSubject = new RealSubject();

        //调用真实对象的方法，进行代理购买Mac
        realSubject.buyMac();
        //代理对象额外做的操作
        this.WrapMac();
    }

    public void WrapMac(){
        System.out.println("用盒子包装好Mac");
    }
}
