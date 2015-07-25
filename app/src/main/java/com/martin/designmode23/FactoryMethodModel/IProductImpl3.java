package com.martin.designmode23.FactoryMethodModel;

import android.util.Log;

/**
 * IProduct的实现类第三种形式，初始化带参数的
 * Created by Martin on 2015/7/25.
 */
public class IProductImpl3 implements IProduct {
    private final String TAG = "IProductImpl3";

    private String parameter;

    public IProductImpl3(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void productMethod() {
        Log.e(TAG, "IProductImpl3的实现类。。。。" + parameter);
    }
}
