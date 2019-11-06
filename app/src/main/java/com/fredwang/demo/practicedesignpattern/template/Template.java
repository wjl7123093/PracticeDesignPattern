package com.fredwang.demo.practicedesignpattern.template;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.template
 * @Author: FredWang
 * @DateTime: 2019-11-06 16:24
 * @Description: 创建抽象模板结构（Abstract Class）：炒菜的步骤
 **/
public abstract class Template {

    /**
     * 背景：小成希望学炒菜：手撕包菜 & 蒜蓉炒菜心
     * 冲突：两道菜的炒菜步骤有的重复有的却差异很大，记不住
     * 解决方案：利用代码记录下来
     */

    /**
     * 【应用场景】
     * 1。一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现；
     * 2。各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复；
     * 3。控制子类的扩展。
     *
     * 【优点】
     * 1。提高代码复用性
     * 将相同部分的代码放在抽象的父类中
     * 2。提高了拓展性
     * 将不同的代码放入不同的子类中，通过对子类的扩展增加新的行为
     * 3。实现了反向控制
     * 通过一个父类调用其子类的操作，通过对子类的扩展增加新的行为，实现了反向控制 & 符合“开闭原则”
     *
     * 【缺点】
     * 引入了抽象类，每一个不同的实现都需要一个子类来实现，导致类的个数增加，从而增加了系统实现的复杂度。
     */

    //模板方法，用来控制炒菜的流程 （炒菜的流程是一样的-复用）
    //申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
    public final void cookProcess(){
        //第一步：倒油
        this.pourOil();
        //第二步：热油
        this.HeatOil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    //定义结构里哪些方法是所有过程都是一样的可复用的，哪些是需要子类进行实现的

    //第一步：倒油是一样的，所以直接实现
    void pourOil(){
        System.out.println("倒油");
    }

    //第二步：热油是一样的，所以直接实现
    void  HeatOil(){
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    //所以声明为抽象方法，具体由子类实现
    abstract void  pourVegetable();

    //第四步：倒调味料是不一样的（一个下辣椒，一个是下蒜蓉）
    //所以声明为抽象方法，具体由子类实现
    abstract void  pourSauce();


    //第五步：翻炒是一样的，所以直接实现
    void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }

}
