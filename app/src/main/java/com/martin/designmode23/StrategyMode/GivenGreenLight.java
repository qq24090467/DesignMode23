package com.martin.designmode23.StrategyMode;

/**
 * 请求开绿灯的计策
 * Created by Martin on 2015/7/26.
 */
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行！");

    }
}
