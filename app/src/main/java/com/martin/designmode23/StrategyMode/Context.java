package com.martin.designmode23.StrategyMode;

/**
 * 当前的作战环境
 * Created by Martin on 2015/7/26.
 */
public class Context {
    IStrategy iStrategy;

    // 构造函数，要你使用哪个妙计
    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate() {
        this.iStrategy.operate();
    }
}
