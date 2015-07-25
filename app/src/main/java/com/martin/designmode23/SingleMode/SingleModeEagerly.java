package com.martin.designmode23.SingleMode;

/**
 * 单利模式：饿汉式
 * Created by Martin on 2015/7/25.
 */
public class SingleModeEagerly {

    //自己进行初始化，每次返回的都是新的对象，但是安全性较高些，浪费内存
    private static SingleModeEagerly mSingleModeEagerly = new SingleModeEagerly();

    public static SingleModeEagerly getInstance() {
        return mSingleModeEagerly;
    }

}
