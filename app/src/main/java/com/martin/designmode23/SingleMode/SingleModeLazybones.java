package com.martin.designmode23.SingleMode;

/**
 * 单利模式：懒汉式
 * Created by Martin on 2015/7/25.
 */
public class SingleModeLazybones {
    private static SingleModeLazybones mSingleModeLazybones;

    //synchronized 保证的是同一时间段只有一个方法调用它，防止同时并发产生多个
    public static synchronized SingleModeLazybones getInstance() {
        if (mSingleModeLazybones == null)
            mSingleModeLazybones = new SingleModeLazybones();
        return mSingleModeLazybones;
    }
}
