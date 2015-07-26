package com.martin.designmode23;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.martin.designmode23.AbstractFactoryModel.AbstractFactoryModel;
import com.martin.designmode23.AdapterMode.Adaptee;
import com.martin.designmode23.AdapterMode.Adapter;
import com.martin.designmode23.BuilderMode.ManBuilder;
import com.martin.designmode23.BuilderMode.Person;
import com.martin.designmode23.BuilderMode.PersonDirector;
import com.martin.designmode23.FactoryMethodModel.FactoryMethodModel;
import com.martin.designmode23.FactoryMethodModel.IProduct;
import com.martin.designmode23.ProxyMode.ProxyMode;
import com.martin.designmode23.SingleMode.SingleModeEagerly;
import com.martin.designmode23.SingleMode.SingleModeLazybones;
import com.martin.designmode23.StrategyMode.StrategyMode;
import com.martin.designmode23.TemplateMethodModel.Benchmark;
import com.martin.designmode23.TemplateMethodModel.MethodBenchmark;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTestSingle(View view) {
        SingleModeEagerly eagerly = SingleModeEagerly.getInstance();
        Log.e(TAG, "单利测试，得到单利对象。。。饿汉式：" + eagerly);
        SingleModeLazybones lazybones = SingleModeLazybones.getInstance();
        Log.e(TAG, "单利测试，得到单利对象。。。懒汉式：" + lazybones);
    }


    public void onTestFactoryMethod(View view) {
        IProduct iProductA = FactoryMethodModel.creator("A", null);
        Log.e(TAG, "共产模式，得到A类型的对象：" + iProductA.getClass().getSimpleName());
        IProduct iProductB = FactoryMethodModel.creator("B", null);
        Log.e(TAG, "共产模式，得到B类型的对象：" + iProductB.getClass().getSimpleName());
        IProduct iProductC = FactoryMethodModel.creator(null, "C类型对");
        Log.e(TAG, "共产模式，得到C类型的对象：" + iProductC.getClass().getSimpleName());
    }

    public void onTestProxyMethod(View view) {
        ProxyMode.testProxy();
    }

    public void onTestAbstractFactoryModel(View view) {
        AbstractFactoryModel.test();
    }

    public void onTestAdapter(View view) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.simpleMethod1();
        adapter.simpleMethod2();
    }

    public void onTestBuilder(View view) {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }

    public void onTestTemplate(View view) {
        Benchmark benchmark = new MethodBenchmark();
        benchmark.repeat(4);
    }

    public void onTestStrategy(View view) {
        StrategyMode strategyMode = new StrategyMode();
        strategyMode.test();
    }
}
