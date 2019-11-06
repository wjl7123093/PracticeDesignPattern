package com.fredwang.demo.practicedesignpattern.builder;

/**
 * @Package: com.fredwang.demo.practicedesignpattern.builder
 * @Author: FredWang
 * @DateTime: 2019-11-06 11:10
 * @Description: 【背景：去电脑城组装电脑】定义组装的过程接口
 **/
public abstract class Builder {

    /**
     * 【应用场景】
     * 1。需要生成的产品对象有复杂的内部结构，这些产品对象具备共性；
     * 2。隔离复杂对象的创建和使用，并使得相同的创建过程可以创建不同的产品。
     *
     * 【优点】
     * 1。易于解耦
     * 将产品本身与产品创建过程进行解耦，可以使用相同的创建过程来得到不同的产品。也就说细节依赖抽象。
     * 2。易于精确控制对象的创建
     * 将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰
     * 3。易于拓展
     * 增加新的具体建造者无需修改原有类库的代码，易于拓展，符合“开闭原则“。
     *
     * 【缺点】
     * 1。建造者模式所创建的产品一般具有较多的共同点，其组成部分相似；如果产品之间的差异性很大，
     * 则不适合使用建造者模式，因此其使用范围受到一定的限制。
     * 2。如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大。
     *
     */

    //第一步：装CPU
    //声明为抽象方法，具体由子类实现
    public abstract void BuildCPU();

    //第二步：装主板
    //声明为抽象方法，具体由子类实现
    public abstract void BuildMainboard();

    //第三步：装硬盘
    //声明为抽象方法，具体由子类实现
    public abstract void BuildHD();

    //返回产品的方法：获得组装好的电脑
    public abstract Computer getComputer();

}
