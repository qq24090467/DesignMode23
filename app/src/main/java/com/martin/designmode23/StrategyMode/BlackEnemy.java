package com.martin.designmode23.StrategyMode;

/**
 * 逃跑计策
 * <p/>
 * Created by Martin on 2015/7/26.
 */
public class BlackEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵...");
    }

}
