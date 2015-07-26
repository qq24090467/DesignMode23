package com.martin.designmode23.StrategyMode;

/**
 * 走后门计策
 * Created by Martin on 2015/7/26.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备...");
    }
}
