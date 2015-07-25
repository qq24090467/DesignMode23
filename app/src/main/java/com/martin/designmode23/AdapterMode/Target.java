package com.martin.designmode23.AdapterMode;

/**
 * 适配器目标实现功能
 * Created by Martin on 2015/7/25.
 */
public interface Target {
    //被适配的类中的方法,直接使用被适配的对象调用
    public void simpleMethod1();

    //被适配的类中没有此方法，此为扩展方法
    public void simpleMethod2();
}
