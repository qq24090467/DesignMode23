package com.martin.designmode23.AdapterMode;

import android.util.Log;

/**
 * 适配器：被适配者
 * Created by Martin on 2015/7/25.
 */
public class Adaptee {
    private final String TAG = "Adaptee";

    public void simpleMethod1() {
        Log.e(TAG, "适配器---->被适配者.");
    }
}
