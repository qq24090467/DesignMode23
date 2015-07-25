package com.martin.designmode23.FactoryMethodModel;

import android.util.Log;

/**
 * IProduct的实现类第一种形式
 * Created by Martin on 2015/7/25.
 */
public class IProductImpl1 implements IProduct {
    private final String TAG = "IProductImpl1";

    @Override
    public void productMethod() {
        Log.e(TAG, "IProductImpl1的实现类。。。。");
    }
}
