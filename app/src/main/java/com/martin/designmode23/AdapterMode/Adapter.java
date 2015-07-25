package com.martin.designmode23.AdapterMode;

import android.util.Log;

/**
 * 适配器：适配器
 * Created by Martin on 2015/7/25.
 */
public class Adapter {

    private final String TAG = "Adapter";

    private Adaptee mAdaptee;

    public Adapter(Adaptee mAdaptee) {
        this.mAdaptee = mAdaptee;
    }

    //被适配的类中的方法,直接使用被适配的对象调用
    public void simpleMethod1(){
        mAdaptee.simpleMethod1();
    }

    //被适配的类中没有此方法，此为扩展方法
    public void simpleMethod2(){
        Log.e(TAG, "适配器---->适配器.");
    }
}
