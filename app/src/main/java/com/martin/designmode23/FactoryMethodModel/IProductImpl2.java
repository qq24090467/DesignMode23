package com.martin.designmode23.FactoryMethodModel;

import android.util.Log;

/**
 * IProduct的实现类第二种形式
 * Created by Martin on 2015/7/25.
 */
public class IProductImpl2 implements IProduct {
    private final String TAG = "IProductImpl2";

    @Override
    public void productMethod() {
        Log.e(TAG, "IProductImpl2的实现类。。。。");
    }
}
