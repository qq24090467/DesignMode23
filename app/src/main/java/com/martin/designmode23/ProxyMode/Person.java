package com.martin.designmode23.ProxyMode;

import android.util.Log;

/**
 * 人的类，继承并实现说话的功能呢
 * Created by Martin on 2015/7/25.
 */
public class Person implements ITalk {
    private final String TAG = "PERSON";

    private String mName;
    private String mAge;

    public Person(String mName, String mAge) {
        this.mName = mName;
        this.mAge = mAge;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmAge() {
        return mAge;
    }

    public void setmAge(String mAge) {
        this.mAge = mAge;
    }

    @Override
    public void talk(String msg) {
        Log.e(TAG, msg + ".......Name=" + mName + "....Age=" + mAge);
    }
}
