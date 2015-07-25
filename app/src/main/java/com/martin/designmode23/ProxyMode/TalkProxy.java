package com.martin.designmode23.ProxyMode;

import android.util.Log;

/**
 * 说话的代理类
 * Created by Martin on 2015/7/25.
 */
public class TalkProxy implements ITalk {
    private final String TAG = "TalkProxy";

    private ITalk mITalk;

    public TalkProxy(ITalk mITalk) {
        this.mITalk = mITalk;
    }

    @Override
    public void talk(String msg) {
        mITalk.talk(msg);
    }

    public void talk(String msg, String singname) {
        mITalk.talk(msg);
        sing(singname);
    }

    private void sing(String singname) {
        Log.e(TAG, "唱歌的名字：" + singname);
    }
}
