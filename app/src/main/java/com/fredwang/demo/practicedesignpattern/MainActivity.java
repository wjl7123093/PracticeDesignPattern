package com.fredwang.demo.practicedesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.fredwang.demo.practicedesignpattern.abstractfactory.ConcreteFactoryA;
import com.fredwang.demo.practicedesignpattern.abstractfactory.ConcreteFactoryB;
import com.fredwang.demo.practicedesignpattern.adapter.Adapter220V;
import com.fredwang.demo.practicedesignpattern.adapter.ImportedMachine;
import com.fredwang.demo.practicedesignpattern.adapter.Target;
import com.fredwang.demo.practicedesignpattern.builder.Builder;
import com.fredwang.demo.practicedesignpattern.builder.Computer;
import com.fredwang.demo.practicedesignpattern.builder.ConcreteBuilder;
import com.fredwang.demo.practicedesignpattern.builder.Director;
import com.fredwang.demo.practicedesignpattern.facade.FacadePattern;
import com.fredwang.demo.practicedesignpattern.factorymethod.FactoryA;
import com.fredwang.demo.practicedesignpattern.factorymethod.FactoryB;
import com.fredwang.demo.practicedesignpattern.proxy.Proxy;
import com.fredwang.demo.practicedesignpattern.proxy.Subject;
import com.fredwang.demo.practicedesignpattern.simplefactory.SimpleFactory;
import com.fredwang.demo.practicedesignpattern.singleton.Singleton;
import com.fredwang.demo.practicedesignpattern.singleton.SingletonLazyDouble;
import com.fredwang.demo.practicedesignpattern.strategy.SalesMan;
import com.fredwang.demo.practicedesignpattern.template.ConcreteBaoCai;
import com.fredwang.demo.practicedesignpattern.template.ConcreteCaiXin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFacadeClick(View v) {
        excuteFacade();
    }

    public void onAdapterClick(View v) {
        excuteAdapter();
    }

    public void onBuilderClick(View v) {
        excuteBuilder();
    }

    public void onProxyClick(View v) {
        excuteProxy();
    }

    public void onStrategyClick(View v) {
        excuteStrategy();
    }

    public void onTemplateClick(View v) {
        excuteTemplate();
    }

    public void onSimpleFactoryClick(View v) {
        excuteSimpleFactory();
    }

    public void onFactoryMethodClick(View v) {
        excuteFactoryMethod();
    }

    public void onAbstractFactoryClick(View v) {
        excuteAbstractFactory();
    }

    public void onSingletonClick(View v) {
        excuteSingleton();
    }

    void excuteFacade() {
        // 实例化电器类
        FacadePattern.SubClass_Light light = new FacadePattern.SubClass_Light();
        FacadePattern.SubClass_Tv tv = new FacadePattern.SubClass_Tv();
        FacadePattern.SubClass_AirConditioner airConditioner = new FacadePattern.SubClass_AirConditioner();

        // 实例化外观对象
        FacadePattern facadePattern = new FacadePattern(light, tv, airConditioner);

        // 客户端直接与外观对象进行交互
        facadePattern.on();
        System.out.println("可以看电视了");
        facadePattern.off();
        System.out.println("可以睡觉了");
    }

    void excuteAdapter() {
        Target mAdapter220V = new Adapter220V();
        ImportedMachine mImportedMachine = new ImportedMachine();

        //用户拿着进口机器插上适配器（调用Convert_110v()方法）
        //再将适配器插上原有插头（Convert_110v()方法内部调用Output_220v()方法输出220V）
        //适配器只是个外壳，对外提供110V，但本质还是220V进行供电
        mAdapter220V.Convert_110v();
        mImportedMachine.Work();
    }

    void excuteBuilder() {
        //逛了很久终于发现一家合适的电脑店
        //找到该店的老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        //沟通需求后，老板叫装机人员去装电脑
        director.Construct(builder);

        //装完后，组装人员搬来组装好的电脑
        Computer computer = builder.getComputer();
        //组装人员展示电脑给小成看
        computer.Show();
    }

    void excuteProxy() {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }

    void excuteStrategy() {
        SalesMan mSalesMan ;

        //春节来了，使用春节促销活动
        System.out.println("对于春节：");
        mSalesMan =  new SalesMan("A");
        mSalesMan.SalesManShow();


        //中秋节来了，使用中秋节促销活动
        System.out.println("对于中秋节：");
        mSalesMan =  new SalesMan("B");
        mSalesMan.SalesManShow();

        //圣诞节来了，使用圣诞节促销活动
        System.out.println("对于圣诞节：");
        mSalesMan =  new SalesMan("C");
        mSalesMan.SalesManShow();
    }

    void excuteTemplate() {
        //炒 - 手撕包菜
        ConcreteBaoCai baoCai = new ConcreteBaoCai();
        baoCai.cookProcess();

        //炒 - 蒜蓉菜心
        ConcreteCaiXin caiXin = new ConcreteCaiXin();
        caiXin.cookProcess();
    }

    void excuteSimpleFactory() {
        SimpleFactory mFactory = new SimpleFactory();

        //客户要产品A
        try {
//调用工厂类的静态方法 & 传入不同参数从而创建产品实例
            mFactory.Manufacture("A").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        //客户要产品B
        try {
            mFactory.Manufacture("B").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        //客户要产品C
        try {
            mFactory.Manufacture("C").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }

        //客户要产品D
        try {
            mFactory.Manufacture("D").show();
        }catch (NullPointerException e){
            System.out.println("没有这一类产品");
        }
    }

    void excuteFactoryMethod() {
        //客户要产品A
        FactoryA mFactoryA = new FactoryA();
        mFactoryA.Manufacture().show();

        //客户要产品B
        FactoryB mFactoryB = new FactoryB();
        mFactoryB.Manufacture().show();
    }

    void excuteAbstractFactory() {
        ConcreteFactoryA mFactoryA = new ConcreteFactoryA();
        ConcreteFactoryB mFactoryB = new ConcreteFactoryB();
        //A厂当地客户需要容器产品A
        mFactoryA.ManufactureContainer().show();
        //A厂当地客户需要模具产品A
        mFactoryA.ManufactureMould().show();

        //B厂当地客户需要容器产品B
        mFactoryB.ManufactureContainer().show();
        //B厂当地客户需要模具产品B
        mFactoryB.ManufactureMould().show();

    }

    void excuteSingleton() {
        SingletonLazyDouble singletonLazyDouble = SingletonLazyDouble.newInstance();
        System.out.println("成功创建双重校验锁单例类");
    }
}
