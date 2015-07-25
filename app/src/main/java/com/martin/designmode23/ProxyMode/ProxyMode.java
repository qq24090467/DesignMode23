package com.martin.designmode23.ProxyMode;

import android.util.Log;

/**
 * 对代理模式的使用
 * Created by Martin on 2015/7/25.
 */
public class ProxyMode {
    private static final String TAG = "ProxyMode";

    public static void testProxy() {
        ITalk person = new Person("Martin", "23");
        person.talk("没有使用代理。。。。");

        Log.e(TAG, "------------------------------------");

        TalkProxy talkProxy = new TalkProxy(person);
        talkProxy.talk("使用代理。。。", "《祖国》");

    }
}
